const cumulativeSum = (sum => value => sum += value)(0);

document.write([5, 10, 3, 2].map(cumulativeSum));