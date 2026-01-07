{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/TransformerUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformerUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 476,
      "comment": "\n * \u003ccode\u003eTransformerUtils\u003c/code\u003e provides reference implementations and\n * utilities for the Transformer functor interface. The supplied transformers are:\n * \u003cul\u003e\n * \u003cli\u003eInvoker - returns the result of a method call on the input object\n * \u003cli\u003eClone - returns a clone of the input object\n * \u003cli\u003eConstant - always returns the same object\n * \u003cli\u003eClosure - performs a Closure and returns the input object\n * \u003cli\u003ePredicate - returns the result of the predicate as a Boolean\n * \u003cli\u003eFactory - returns a new object from a factory\n * \u003cli\u003eChained - chains two or more transformers together\n * \u003cli\u003eIf - calls one transformer or another based on a predicate\n * \u003cli\u003eSwitch - calls one transformer based on one or more predicates\n * \u003cli\u003eSwitchMap - calls one transformer looked up from a Map\n * \u003cli\u003eInstantiate - the Class input object is instantiated\n * \u003cli\u003eMap - returns an object from a supplied Map\n * \u003cli\u003eNull - always returns null\n * \u003cli\u003eNOP - returns the input object, which should be immutable\n * \u003cli\u003eException - always throws an exception\n * \u003cli\u003eStringValue - returns a \u003ccode\u003ejava.lang.String\u003c/code\u003e representation of the input object\n * \u003c/ul\u003e\n * All the supplied transformers are Serializable.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.TransformerUtils.TransformerUtils()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * This class is not normally instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.exceptionTransformer()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Gets a transformer that always throws an exception.\n     * This could be useful during testing as a placeholder.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @return the transformer\n     * @see ExceptionTransformer\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.nullTransformer()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Gets a transformer that always returns null.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @return the transformer\n     * @see ConstantTransformer\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.nopTransformer()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Gets a transformer that returns the input object.\n     * The input object should be immutable to maintain the\n     * contract of Transformer (although this is not checked).\n     *\n     * @param \u003cT\u003e  the input/output type\n     * @return the transformer\n     * @see NOPTransformer\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.cloneTransformer()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Gets a transformer that returns a clone of the input object.\n     * The input object will be cloned using one of these techniques (in order):\n     * \u003cul\u003e\n     * \u003cli\u003epublic clone method\n     * \u003cli\u003epublic copy constructor\n     * \u003cli\u003eserialization clone\n     * \u003cul\u003e\n     *\n     * @param \u003cT\u003e  the input/output type\n     * @return the transformer\n     * @see CloneTransformer\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.constantTransformer(O)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Creates a Transformer that will return the same object each time the\n     * transformer is used.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param constantToReturn  the constant object to return each time in the transformer\n     * @return the transformer.\n     * @see ConstantTransformer\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.Closure\u003c? super T\u003e)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Creates a Transformer that calls a Closure each time the transformer is used.\n     * The transformer returns the input object.\n     *\n     * @param \u003cT\u003e  the input/output type\n     * @param closure  the closure to run each time in the transformer, not null\n     * @return the transformer\n     * @throws IllegalArgumentException if the closure is null\n     * @see ClosureTransformer\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Creates a Transformer that calls a Predicate each time the transformer is used.\n     * The transformer will return either Boolean.TRUE or Boolean.FALSE.\n     *\n     * @param \u003cT\u003e  the input type\n     * @param predicate  the predicate to run each time in the transformer, not null\n     * @return the transformer\n     * @throws IllegalArgumentException if the predicate is null\n     * @see PredicateTransformer\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.Factory\u003c? extends O\u003e)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Creates a Transformer that calls a Factory each time the transformer is used.\n     * The transformer will return the value returned by the factory.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param factory  the factory to run each time in the transformer, not null\n     * @return the transformer\n     * @throws IllegalArgumentException if the factory is null\n     * @see FactoryTransformer\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.chainedTransformer(org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e...)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Create a new Transformer that calls each transformer in turn, passing the\n     * result into the next transformer.\n     *\n     * @param \u003cT\u003e  the input/output type\n     * @param transformers  an array of transformers to chain\n     * @return the transformer\n     * @throws IllegalArgumentException if the transformers array or any of the transformers is null\n     * @see ChainedTransformer\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collection\u003c? extends org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e\u003e)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Create a new Transformer that calls each transformer in turn, passing the\n     * result into the next transformer. The ordering is that of the iterator()\n     * method on the collection.\n     *\n     * @param \u003cT\u003e  the input/output type\n     * @param transformers  a collection of transformers to chain\n     * @return the transformer\n     * @throws IllegalArgumentException if the transformers collection or any of the transformers is null\n     * @see ChainedTransformer\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.ifTransformer(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Create a new Transformer that calls the transformer if the predicate is true,\n     * otherwise the input object is returned unchanged.\n     *\n     * @param \u003cT\u003e  the input / output type\n     * @param predicate  the predicate to switch on\n     * @param trueTransformer  the transformer called if the predicate is true\n     * @return the transformer\n     * @throws IllegalArgumentException if either the predicate or transformer is null\n     * @see IfTransformer\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.ifTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 245,
      "end_line": 249,
      "comment": "\n     * Create a new Transformer that calls one of two transformers depending\n     * on the specified predicate.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param predicate  the predicate to switch on\n     * @param trueTransformer  the transformer called if the predicate is true\n     * @param falseTransformer  the transformer called if the predicate is false\n     * @return the transformer\n     * @throws IllegalArgumentException if either the predicate or transformer is null\n     * @see IfTransformer\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 265,
      "end_line": 272,
      "comment": "\n     * Create a new Transformer that calls one of two transformers depending\n     * on the specified predicate.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param predicate  the predicate to switch on\n     * @param trueTransformer  the transformer called if the predicate is true\n     * @param falseTransformer  the transformer called if the predicate is false\n     * @return the transformer\n     * @throws IllegalArgumentException if either the predicate or transformer is null\n     * @see SwitchTransformer\n     * @deprecated as of 4.1, use {@link #ifTransformer(Predicate, Transformer, Transformer))\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 271,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e[])",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Create a new Transformer that calls one of the transformers depending\n     * on the predicates. The transformer at array location 0 is called if the\n     * predicate at array location 0 returned true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, null is returned.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param predicates  an array of predicates to check\n     * @param transformers  an array of transformers to call\n     * @return the transformer\n     * @throws IllegalArgumentException if the either array is null or empty\n     * @throws IllegalArgumentException if any element in the arrays is null\n     * @throws IllegalArgumentException if the arrays are different sizes\n     * @see SwitchTransformer\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.Predicate\u003c? super I\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e[], org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 313,
      "end_line": 317,
      "comment": "\n     * Create a new Transformer that calls one of the transformers depending\n     * on the predicates. The transformer at array location 0 is called if the\n     * predicate at array location 0 returned true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, the default\n     * transformer is called. If the default transformer is null, null is returned.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param predicates  an array of predicates to check\n     * @param transformers  an array of transformers to call\n     * @param defaultTransformer  the default to call if no predicate matches, null means return null\n     * @return the transformer\n     * @throws IllegalArgumentException if the either array is null or empty\n     * @throws IllegalArgumentException if any element in the arrays is null\n     * @throws IllegalArgumentException if the arrays are different sizes\n     * @see SwitchTransformer\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.switchTransformer(java.util.Map\u003corg.apache.commons.collections4.Predicate\u003cI\u003e, org.apache.commons.collections4.Transformer\u003cI, O\u003e\u003e)",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * Create a new Transformer that calls one of the transformers depending\n     * on the predicates.\n     * \u003cp\u003e\n     * The Map consists of Predicate keys and Transformer values. A transformer\n     * is called if its matching predicate returns true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, the default\n     * transformer is called. The default transformer is set in the map with a\n     * null key. If no default transformer is set, null will be returned in a default\n     * case. The ordering is that of the iterator() method on the entryset collection\n     * of the map.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param predicatesAndTransformers  a map of predicates to transformers\n     * @return the transformer\n     * @throws IllegalArgumentException if the map is null or empty\n     * @throws IllegalArgumentException if any transformer in the map is null\n     * @throws ClassCastException  if the map elements are of the wrong type\n     * @see SwitchTransformer\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.switchMapTransformer(java.util.Map\u003cI, org.apache.commons.collections4.Transformer\u003cI, O\u003e\u003e)",
      "begin_line": 362,
      "end_line": 379,
      "comment": "\n     * Create a new Transformer that uses the input object as a key to find the\n     * transformer to call.\n     * \u003cp\u003e\n     * The Map consists of object keys and Transformer values. A transformer\n     * is called if the input object equals the key. If there is no match, the\n     * default transformer is called. The default transformer is set in the map\n     * using a null key. If no default is set, null will be returned in a default case.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param objectsAndTransformers  a map of objects to transformers\n     * @return the transformer\n     * @throws IllegalArgumentException if the map is null or empty\n     * @throws IllegalArgumentException if any transformer in the map is null\n     * @see SwitchTransformer\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 92)",
        "(line 370,col 9)-(line 370,col 55)",
        "(line 371,col 9)-(line 371,col 80)",
        "(line 372,col 9)-(line 372,col 57)",
        "(line 373,col 9)-(line 373,col 18)",
        "(line 374,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.instantiateTransformer()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Gets a Transformer that expects an input Class object that it will instantiate.\n     *\n     * @param \u003cT\u003e  the output type\n     * @return the transformer\n     * @see InstantiateTransformer\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.instantiateTransformer(java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n     * Creates a Transformer that expects an input Class object that it will\n     * instantiate. The constructor used is determined by the arguments specified\n     * to this method.\n     *\n     * @param \u003cT\u003e  the output type\n     * @param paramTypes  parameter types for the constructor, can be null\n     * @param args  the arguments to pass to the constructor, can be null\n     * @return the transformer\n     * @throws IllegalArgumentException if the paramTypes and args don\u0027t match\n     * @see InstantiateTransformer\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.mapTransformer(java.util.Map\u003c? super I, ? extends O\u003e)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Creates a Transformer that uses the passed in Map to transform the input\n     * object (as a simple lookup).\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param map  the map to use to transform the objects\n     * @return the transformer, or {@link ConstantTransformer#nullTransformer()} if the\n     *   {@code map} is {@code null}\n     * @see MapTransformer\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.invokerTransformer(java.lang.String)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Gets a Transformer that invokes a method on the input object.\n     * The method must have no parameters. If the input object is null,\n     * null is returned.\n     * \u003cp\u003e\n     * For example, \u003ccode\u003eTransformerUtils.invokerTransformer(\"getName\");\u003c/code\u003e\n     * will call the \u003ccode\u003egetName/code\u003e method on the input object to\n     * determine the transformer result.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the method name to call on the input object, may not be null\n     * @return the transformer\n     * @throws IllegalArgumentException if the methodName is null.\n     * @see InvokerTransformer\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.invokerTransformer(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 458,
      "end_line": 461,
      "comment": "\n     * Gets a Transformer that invokes a method on the input object.\n     * The method parameters are specified. If the input object is {@code null},\n     * {@code null} is returned.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param methodName  the name of the method\n     * @param paramTypes  the parameter types\n     * @param args  the arguments\n     * @return the transformer\n     * @throws IllegalArgumentException if the method name is null or the paramTypes and args don\u0027t match\n     * @see InvokerTransformer\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TransformerUtils.stringValueTransformer()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * Gets a transformer that returns a \u003ccode\u003ejava.lang.String\u003c/code\u003e\n     * representation of the input object. This is achieved via the\n     * \u003ccode\u003etoString\u003c/code\u003e method, \u003ccode\u003enull\u003c/code\u003e returns \u0027null\u0027.\n     *\n     * @param \u003cT\u003e  the input type\n     * @return the transformer\n     * @see StringValueTransformer\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 63)"
      ]
    }
  ]
}