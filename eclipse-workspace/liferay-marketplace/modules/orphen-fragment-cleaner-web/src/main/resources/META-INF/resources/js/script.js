let logEvent = null;

document.addEventListener("DOMContentLoaded", function () {    
        subscribeLogs();
        logEvent = setInterval(function () {
            subscribeLogs();
        }, 1000);
 });

function subscribeLogs() {
    const formData = new FormData();

    fetch(liveLogMVCResourceURL, {
        method: 'POST',
        body: formData,
        cache: 'no-cache',
    })
    .then(response => response.json())
    .then(data => {
        const liveLogDiv = document.getElementById("liveLogDiv");
        liveLogDiv.innerHTML = "";

        for (const value of data) {
            const p = document.createElement("p");
            p.textContent = value;
            liveLogDiv.prepend(p);
        }
    })
    .catch(error => {
        console.error('Error fetching logs:', error);
    });
}
