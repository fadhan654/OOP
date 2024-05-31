document.addEventListener('DOMContentLoaded', () => {
    const container = document.querySelector('.container');

    for (let i = 0; i < 20; i++) {
        const balloon = document.createElement('div');
        balloon.classList.add('balloon');
        balloon.style.left = Math.random() * 100 + 'vw';
        balloon.style.animationDuration = 2 + Math.random() * 3 + 's';
        container.appendChild(balloon);
    }
});

const styles = document.createElement('style');
styles.innerHTML = `
    .balloon {
        position: absolute;
        bottom: -100px;
        width: 50px;
        height: 70px;
        background: radial-gradient(circle, #ff9a9e, #fad0c4);
        border-radius: 50% 50% 0 0;
        animation: rise 5s ease-in-out infinite;
    }
    
    @keyframes rise {
        0% { transform: translateY(0); }
        100% { transform: translateY(-100vh); }
    }
`;
document.head.appendChild(styles);
