// Hide and show the field seach
const showInputBtn = document.getElementById('showInputBtn');
const inputField = document.getElementById('inputField');

showInputBtn.addEventListener('click', function() {

  if (inputField.style.display === 'none') {
    inputField.style.display = 'block';
    inputField.style.transitionDuration = '0.6;';
    inputField.style.width = '150px';
    inputField.style.height = '30px';
  } else {
    inputField.style.display = 'none';
  }
});

// Registration button naimation

const registrationbtn = document.getElementById('registrationbtn');

registrationbtn.addEventListener('click', function myfunction(){
        registrationbtn.style.backgroundColor = 'white';
        registrationbtn.style.border = '3px solid #344dc5';
        registrationbtn.style.color = '#344dc5';
});

// li Decoration

const cloude = document.getElementById('cloud');

cloude.addEventListener('click',function(){
    cloude.width = '90px';
    cloude.style.transition = '0.3s';
    cloude.height = '45px';
    cloude.style.cursor = 'pointer';
    cloude.style.marginTop = '50px';
});

