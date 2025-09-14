const reveals = document.querySelectorAll('.reveal');
window.addEventListener('scroll', () => {
  const winH = window.innerHeight;
  reveals.forEach(el => {
    if (el.getBoundingClientRect().top < winH - 100) {
      el.classList.add('active');
    }
  });
});

function toggleExp(card) {
  const details = card.querySelector('.exp-details');
  details.classList.toggle('active');
}
