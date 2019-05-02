function XXX() {

}


function checkForm($this) {
    var str=$this.value;
    while(str.match(/[^A-Z^a-z\d\-]/))
    {
        str=str.replace(/[^A-Z^a-z\d\-]/,"");
    }
    $this.value=str;
}


function buttonOver($this) {
	$this.style.color = "blue";
	$this.style.fontWeight = "bold";
}

function buttonOut($this) {
	$this.style.color = "black";
	$this.style.fontWeight = "normal";
}


function dispMessageArea(){
	var html = "";

	html += '  <div class="messageArea">';
	html += '    <p>';
	html += '      <hr width="100%" size="2" color="#000000" noshade>';
	html += '        <label>メッセージ：</label><label th:text="${message}"></label>';
	html += '      <hr width="100%" size="2" color="#000000" noshade>';
	html += '    </p>';
	html += '  </div>';

	document.write(html);
	}

