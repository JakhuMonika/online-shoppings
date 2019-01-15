$(function() {
	// solving the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#ListofProducts').addClass('active');
		break;

	default:
		$('#ListofProducts').addClass('active');
		$('#a_' + menu).addClass('active');
		break;

	}
});
