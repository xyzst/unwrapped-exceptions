# unwrapped-exceptions

## PROBLEM: 

In the latest version of Mapstruct (v1.2.0_CR2), the generated implementation files are not wrapping some thrown exceptions in try-catch blocks in this given scenario (refer to the project). I am not entirely sure if this is a configuration problem on my end or a Mapstruct bug. As per request of one of the maintainers of Mapstruct project, I have created a barebones project that replicates the problem.
