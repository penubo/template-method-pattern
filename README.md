# template-method-pattern

## What is a template method pattern?
The template method pattern is a software design pattern. If you have many simular algorithms sperately, then this
pattern can be useful for removing duplication of your code.

Some web MVC frameworks are wonderful example of using this pattern. A web MVC framework would do the very simular 
things for each request from the client.
1. get request
2. process a request
3. run services
4. render results

Those processes are written in a very high level. But, I think the above is just enough to explain why the 
template method pattern is useful.

Every request has different requirements, services, and render types. Here let's assume that algorithm step 1 (getting request)
will be the same throughout your web service. Using the template pattern, you can provide little boxes to the developer
who can fill in with the logic they needs. you can (2) process a request differently,
(3) run different services, or even (4) render results differently like file format or json format.

Another good example of this pattern is one of the java's collection method `Array.sorts()`. This method uses
`Comparable` interface inside it. So you can override `compareTo` method in you classes to modify the behavior of sort.