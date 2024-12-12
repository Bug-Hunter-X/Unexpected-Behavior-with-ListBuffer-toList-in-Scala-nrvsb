# Scala ListBuffer toList Unexpected Behavior

This repository demonstrates an uncommon and potentially confusing behavior in Scala when converting a mutable `ListBuffer` to an immutable `List` using the `toList` method.  The key takeaway is that `toList` creates a *copy*—any changes made to the original `ListBuffer` after calling `toList` will *not* reflect in the resulting immutable `List`.

## Bug Description

The bug lies in the misunderstanding of how `toList` works.  It creates a snapshot of the `ListBuffer`'s contents at the time of the call.  Subsequent modifications to the `ListBuffer` will leave the immutable `List` unchanged.

## How to Reproduce

1. Clone the repository.
2. Compile and run `Bug.scala`.
3. Observe that the immutable list remains unchanged even after modifications to the `ListBuffer`.