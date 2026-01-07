{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/ClosureUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 370,
      "comment": "\n * \u003ccode\u003eClosureUtils\u003c/code\u003e provides reference implementations and utilities\n * for the Closure functor interface. The supplied closures are:\n * \u003cul\u003e\n * \u003cli\u003eInvoker - invokes a method on the input object\n * \u003cli\u003eFor - repeatedly calls a closure for a fixed number of times\n * \u003cli\u003eWhile - repeatedly calls a closure while a predicate is true\n * \u003cli\u003eDoWhile - repeatedly calls a closure while a predicate is true\n * \u003cli\u003eChained - chains two or more closures together\n * \u003cli\u003eIf - calls one closure or another based on a predicate\n * \u003cli\u003eSwitch - calls one closure based on one or more predicates\n * \u003cli\u003eSwitchMap - calls one closure looked up from a Map\n * \u003cli\u003eTransformer - wraps a Transformer as a Closure\n * \u003cli\u003eNOP - does nothing\n * \u003cli\u003eException - always throws an exception\n * \u003c/ul\u003e\n * All the supplied closures are Serializable.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ClosureUtils.ClosureUtils()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * This class is not normally instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.exceptionClosure()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Gets a Closure that always throws an exception.\n     * This could be useful during testing as a placeholder.\n     *\n     * @see org.apache.commons.collections4.functors.ExceptionClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @return the closure\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.nopClosure()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Gets a Closure that will do nothing.\n     * This could be useful during testing as a placeholder.\n     *\n     * @see org.apache.commons.collections4.functors.NOPClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @return the closure\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.asClosure(org.apache.commons.collections4.Transformer\u003c? super E, ?\u003e)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Creates a Closure that calls a Transformer each time it is called.\n     * The transformer will be called using the closure\u0027s input object.\n     * The transformer\u0027s result will be ignored.\n     *\n     * @see org.apache.commons.collections4.functors.TransformerClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param transformer  the transformer to run each time in the closure, null means nop\n     * @return the closure\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.forClosure(int, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Creates a Closure that will call the closure \u003ccode\u003ecount\u003c/code\u003e times.\n     * \u003cp\u003e\n     * A null closure or zero count returns the \u003ccode\u003eNOPClosure\u003c/code\u003e.\n     *\n     * @see org.apache.commons.collections4.functors.ForClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param count  the number of times to loop\n     * @param closure  the closure to call repeatedly\n     * @return the \u003ccode\u003efor\u003c/code\u003e closure\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.whileClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Creates a Closure that will call the closure repeatedly until the\n     * predicate returns false.\n     *\n     * @see org.apache.commons.collections4.functors.WhileClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param predicate  the predicate to use as an end of loop test, not null\n     * @param closure  the closure to call repeatedly, not null\n     * @return the \u003ccode\u003ewhile\u003c/code\u003e closure\n     * @throws NullPointerException if either argument is null\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.doWhileClosure(org.apache.commons.collections4.Closure\u003c? super E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Creates a Closure that will call the closure once and then repeatedly\n     * until the predicate returns false.\n     *\n     * @see org.apache.commons.collections4.functors.WhileClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param closure  the closure to call repeatedly, not null\n     * @param predicate  the predicate to use as an end of loop test, not null\n     * @return the \u003ccode\u003edo-while\u003c/code\u003e closure\n     * @throws NullPointerException if either argument is null\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.invokerClosure(java.lang.String)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Creates a Closure that will invoke a specific method on the closure\u0027s\n     * input object by reflection.\n     *\n     * @see org.apache.commons.collections4.functors.InvokerTransformer\n     * @see org.apache.commons.collections4.functors.TransformerClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param methodName  the name of the method\n     * @return the \u003ccode\u003einvoker\u003c/code\u003e closure\n     * @throws NullPointerException if the method name is null\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.invokerClosure(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 183,
      "end_line": 187,
      "comment": "\n     * Creates a Closure that will invoke a specific method on the closure\u0027s\n     * input object by reflection.\n     *\n     * @see org.apache.commons.collections4.functors.InvokerTransformer\n     * @see org.apache.commons.collections4.functors.TransformerClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param methodName  the name of the method\n     * @param paramTypes  the parameter types\n     * @param args  the arguments\n     * @return the \u003ccode\u003einvoker\u003c/code\u003e closure\n     * @throws NullPointerException if the method name is null\n     * @throws IllegalArgumentException if the paramTypes and args don\u0027t match\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.chainedClosure(org.apache.commons.collections4.Closure\u003c? super E\u003e...)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Create a new Closure that calls each closure in turn, passing the\n     * result into the next closure.\n     *\n     * @see org.apache.commons.collections4.functors.ChainedClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param closures  an array of closures to chain\n     * @return the \u003ccode\u003echained\u003c/code\u003e closure\n     * @throws NullPointerException if the closures array is null\n     * @throws NullPointerException if any closure in the array is null\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.chainedClosure(java.util.Collection\u003c? extends org.apache.commons.collections4.Closure\u003c? super E\u003e\u003e)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Create a new Closure that calls each closure in turn, passing the\n     * result into the next closure. The ordering is that of the iterator()\n     * method on the collection.\n     *\n     * @see org.apache.commons.collections4.functors.ChainedClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param closures  a collection of closures to chain\n     * @return the \u003ccode\u003echained\u003c/code\u003e closure\n     * @throws NullPointerException if the closures collection is null\n     * @throws NullPointerException if any closure in the collection is null\n     * @throws IllegalArgumentException if the closures collection is empty\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Create a new Closure that calls another closure based on the\n     * result of the specified predicate.\n     *\n     * @see org.apache.commons.collections4.functors.IfClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param predicate  the validating predicate\n     * @param trueClosure  the closure called if the predicate is true\n     * @return the \u003ccode\u003eif\u003c/code\u003e closure\n     * @throws NullPointerException if the predicate or closure is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.ifClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 254,
      "end_line": 258,
      "comment": "\n     * Create a new Closure that calls one of two closures depending\n     * on the specified predicate.\n     *\n     * @see org.apache.commons.collections4.functors.IfClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param predicate  the predicate to switch on\n     * @param trueClosure  the closure called if the predicate is true\n     * @param falseClosure  the closure called if the predicate is false\n     * @return the \u003ccode\u003eswitch\u003c/code\u003e closure\n     * @throws NullPointerException if the predicate or either closure is null\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.switchClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e[])",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * Create a new Closure that calls one of the closures depending\n     * on the predicates.\n     * \u003cp\u003e\n     * The closure at array location 0 is called if the predicate at array\n     * location 0 returned true. Each predicate is evaluated\n     * until one returns true.\n     *\n     * @see org.apache.commons.collections4.functors.SwitchClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param predicates  an array of predicates to check, not null\n     * @param closures  an array of closures to call, not null\n     * @return the \u003ccode\u003eswitch\u003c/code\u003e closure\n     * @throws NullPointerException if the either array is null\n     * @throws NullPointerException if any element in the arrays is null\n     * @throws IllegalArgumentException if the arrays have different sizes\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.switchClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "\n     * Create a new Closure that calls one of the closures depending\n     * on the predicates.\n     * \u003cp\u003e\n     * The closure at array location 0 is called if the predicate at array\n     * location 0 returned true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, the default\n     * closure is called.\n     *\n     * @see org.apache.commons.collections4.functors.SwitchClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param predicates  an array of predicates to check, not null\n     * @param closures  an array of closures to call, not null\n     * @param defaultClosure  the default to call if no predicate matches\n     * @return the \u003ccode\u003eswitch\u003c/code\u003e closure\n     * @throws NullPointerException if the either array is null\n     * @throws NullPointerException if any element in the arrays is null\n     * @throws IllegalArgumentException if the arrays are different sizes\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.switchClosure(java.util.Map\u003corg.apache.commons.collections4.Predicate\u003cE\u003e, org.apache.commons.collections4.Closure\u003cE\u003e\u003e)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Create a new Closure that calls one of the closures depending\n     * on the predicates.\n     * \u003cp\u003e\n     * The Map consists of Predicate keys and Closure values. A closure\n     * is called if its matching predicate returns true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, the default\n     * closure is called. The default closure is set in the map with a\n     * null key. The ordering is that of the iterator() method on the entryset\n     * collection of the map.\n     *\n     * @see org.apache.commons.collections4.functors.SwitchClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param predicatesAndClosures  a map of predicates to closures\n     * @return the \u003ccode\u003eswitch\u003c/code\u003e closure\n     * @throws NullPointerException if the map is null\n     * @throws NullPointerException if any closure in the map is null\n     * @throws IllegalArgumentException if the map is empty\n     * @throws ClassCastException  if the map elements are of the wrong type\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtils.switchMapClosure(java.util.Map\u003c? extends E, org.apache.commons.collections4.Closure\u003cE\u003e\u003e)",
      "begin_line": 352,
      "end_line": 368,
      "comment": "\n     * Create a new Closure that uses the input object as a key to find the\n     * closure to call.\n     * \u003cp\u003e\n     * The Map consists of object keys and Closure values. A closure\n     * is called if the input object equals the key. If there is no match, the\n     * default closure is called. The default closure is set in the map\n     * using a null key.\n     *\n     * @see org.apache.commons.collections4.functors.SwitchClosure\n     *\n     * @param \u003cE\u003e  the type that the closure acts on\n     * @param objectsAndClosures  a map of objects to closures\n     * @return the closure\n     * @throws NullPointerException if the map is null\n     * @throws NullPointerException if any closure in the map is null\n     * @throws IllegalArgumentException if the map is empty\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 71)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 359,col 9)-(line 359,col 59)",
        "(line 360,col 9)-(line 360,col 57)",
        "(line 361,col 9)-(line 361,col 18)",
        "(line 362,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 62)"
      ]
    }
  ]
}