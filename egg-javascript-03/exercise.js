// egg
// fetching data from a server using a promise

function fetchData(url) {
    const dataPromise = new Promise((resolve, reject) => {
      setTimeout(() => {
        const randomValue = Math.random();
  
        if (randomValue > 0.5) {
          const mockData = { message: 'Data fetched successfully!' };
          resolve(mockData);
        } else {
          const mockError = { error: 'Error fetching data!' };
          reject(mockError);
        }
      }, 2000);
    });
  
    return dataPromise;
  }
  
  fetchData('https://example.com/api/data')
    .then((data) => {
      console.log('Resolved:', data);
    })
    .catch((error) => {
      console.log('Rejected:', error);
    });
  