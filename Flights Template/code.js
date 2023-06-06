const showbtn = document.getElementById('button');
const listshown = document.getElementsByClassName('list')[0];
const contactus = document.getElementById('contactus');
showbtn.addEventListener('click', function() {
  if (listshown.style.display === 'none') {
    listshown.style.display = 'block';

  } else {
    listshown.style.display = 'none';
    contactus.style.marginTop = '0px';
  }
});
