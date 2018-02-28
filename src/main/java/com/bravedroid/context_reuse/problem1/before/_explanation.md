There is a possibility to refactor a set of instructions that encapsulate some different actions in between,
 so we can reuse the statements before and after the various different actions.. 

In the StreamManager we have to encapsulated the context 
and encapsulate the actions that changes from each use of the context..

the parts that could change are encapsulated by this comment: 
//CAN BE EXTRACTED FROM ALL THIS CONTEXT
