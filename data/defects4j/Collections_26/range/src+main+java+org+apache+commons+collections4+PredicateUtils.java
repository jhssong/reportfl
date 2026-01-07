{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/PredicateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 72,
      "end_line": 540,
      "comment": "\n * \u003ccode\u003ePredicateUtils\u003c/code\u003e provides reference implementations and utilities\n * for the Predicate functor interface. The supplied predicates are:\n * \u003cul\u003e\n * \u003cli\u003eInvoker - returns the result of a method call on the input object\n * \u003cli\u003eInstanceOf - true if the object is an instanceof a class\n * \u003cli\u003eEqual - true if the object equals() a specified object\n * \u003cli\u003eIdentity - true if the object \u003d\u003d a specified object\n * \u003cli\u003eNull - true if the object is null\n * \u003cli\u003eNotNull - true if the object is not null\n * \u003cli\u003eUnique - true if the object has not already been evaluated\n * \u003cli\u003eAnd/All - true if all of the predicates are true\n * \u003cli\u003eOr/Any - true if any of the predicates is true\n * \u003cli\u003eEither/One - true if only one of the predicate is true\n * \u003cli\u003eNeither/None - true if none of the predicates are true\n * \u003cli\u003eNot - true if the predicate is false, and vice versa\n * \u003cli\u003eTransformer - wraps a Transformer as a Predicate\n * \u003cli\u003eTrue - always return true\n * \u003cli\u003eFalse - always return false\n * \u003cli\u003eException - always throws an exception\n * \u003cli\u003eNullIsException/NullIsFalse/NullIsTrue - check for null input\n * \u003cli\u003eTransformed - transforms the input before calling the predicate\n * \u003c/ul\u003e\n * All the supplied predicates are Serializable.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.PredicateUtils.PredicateUtils()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * This class is not normally instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.exceptionPredicate()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Gets a Predicate that always throws an exception.\n     * This could be useful during testing as a placeholder.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @return the predicate\n     * @see ExceptionPredicate\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.truePredicate()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Gets a Predicate that always returns true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @return the predicate\n     * @see TruePredicate\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.falsePredicate()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Gets a Predicate that always returns false.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @return the predicate\n     * @see FalsePredicate\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.nullPredicate()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Gets a Predicate that checks if the input object passed in is null.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @return the predicate\n     * @see NullPredicate\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.notNullPredicate()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Gets a Predicate that checks if the input object passed in is not null.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @return the predicate\n     * @see NotNullPredicate\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.equalPredicate(T)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Creates a Predicate that checks if the input object is equal to the\n     * specified object using equals().\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param value  the value to compare against\n     * @return the predicate\n     * @see EqualPredicate\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.identityPredicate(T)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Creates a Predicate that checks if the input object is equal to the\n     * specified object by identity.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param value  the value to compare against\n     * @return the predicate\n     * @see IdentityPredicate\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.instanceofPredicate(java.lang.Class\u003c?\u003e)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Creates a Predicate that checks if the object passed in is of\n     * a particular type, using instanceof. A \u003ccode\u003enull\u003c/code\u003e input\n     * object will return \u003ccode\u003efalse\u003c/code\u003e.\n     *\n     * @param type  the type to check for, may not be null\n     * @return the predicate\n     * @throws NullPointerException if the class is null\n     * @see InstanceofPredicate\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.uniquePredicate()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Creates a Predicate that returns true the first time an object is\n     * encountered, and false if the same object is received\n     * again. The comparison is by equals(). A \u003ccode\u003enull\u003c/code\u003e input object\n     * is accepted and will return true the first time, and false subsequently\n     * as well.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @return the predicate\n     * @see UniquePredicate\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.invokerPredicate(java.lang.String)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Creates a Predicate that invokes a method on the input object.\n     * The method must return either a boolean or a non-null Boolean,\n     * and have no parameters. If the input object is null, a\n     * PredicateException is thrown.\n     * \u003cp\u003e\n     * For example, \u003ccode\u003ePredicateUtils.invokerPredicate(\"isEmpty\");\u003c/code\u003e\n     * will call the \u003ccode\u003eisEmpty\u003c/code\u003e method on the input object to\n     * determine the predicate result.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param methodName  the method name to call on the input object, may not be null\n     * @return the predicate\n     * @throws NullPointerException if the methodName is null.\n     * @see InvokerTransformer\n     * @see TransformerPredicate\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.invokerPredicate(java.lang.String, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 236,
      "end_line": 240,
      "comment": "\n     * Creates a Predicate that invokes a method on the input object.\n     * The method must return either a boolean or a non-null Boolean,\n     * and have no parameters. If the input object is null, a\n     * PredicateException is thrown.\n     * \u003cp\u003e\n     * For example, \u003ccode\u003ePredicateUtils.invokerPredicate(\"isEmpty\");\u003c/code\u003e\n     * will call the \u003ccode\u003eisEmpty\u003c/code\u003e method on the input object to\n     * determine the predicate result.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param methodName  the method name to call on the input object, may not be null\n     * @param paramTypes  the parameter types\n     * @param args  the arguments\n     * @return the predicate\n     * @throws NullPointerException if the method name is null\n     * @throws IllegalArgumentException if the paramTypes and args don\u0027t match\n     * @see InvokerTransformer\n     * @see TransformerPredicate\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.andPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * Create a new Predicate that returns true only if both of the specified\n     * predicates are true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate1  the first predicate, may not be null\n     * @param predicate2  the second predicate, may not be null\n     * @return the \u003ccode\u003eand\u003c/code\u003e predicate\n     * @throws NullPointerException if either predicate is null\n     * @see AndPredicate\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.allPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Create a new Predicate that returns true only if all of the specified\n     * predicates are true.\n     * If the array of predicates is empty, then this predicate returns true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  an array of predicates to check, may not be null\n     * @return the \u003ccode\u003eall\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     * @see AllPredicate\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.allPredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Create a new Predicate that returns true only if all of the specified\n     * predicates are true. The predicates are checked in iterator order.\n     * If the collection of predicates is empty, then this predicate returns true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  a collection of predicates to check, may not be null\n     * @return the \u003ccode\u003eall\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates collection is null\n     * @throws NullPointerException if any predicate in the collection is null\n     * @see AllPredicate\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.orPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * Create a new Predicate that returns true if either of the specified\n     * predicates are true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate1  the first predicate, may not be null\n     * @param predicate2  the second predicate, may not be null\n     * @return the \u003ccode\u003eor\u003c/code\u003e predicate\n     * @throws NullPointerException if either predicate is null\n     * @see OrPredicate\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.anyPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Create a new Predicate that returns true if any of the specified\n     * predicates are true.\n     * If the array of predicates is empty, then this predicate returns false.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  an array of predicates to check, may not be null\n     * @return the \u003ccode\u003eany\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     * @see AnyPredicate\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.anyPredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Create a new Predicate that returns true if any of the specified\n     * predicates are true. The predicates are checked in iterator order.\n     * If the collection of predicates is empty, then this predicate returns false.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  a collection of predicates to check, may not be null\n     * @return the \u003ccode\u003eany\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates collection is null\n     * @throws NullPointerException if any predicate in the collection is null\n     * @see AnyPredicate\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.eitherPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\n     * Create a new Predicate that returns true if one, but not both, of the\n     * specified predicates are true. XOR\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate1  the first predicate, may not be null\n     * @param predicate2  the second predicate, may not be null\n     * @return the \u003ccode\u003eeither\u003c/code\u003e predicate\n     * @throws NullPointerException if either predicate is null\n     * @see OnePredicate\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 355,col 94)",
        "(line 356,col 9)-(line 356,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.onePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Create a new Predicate that returns true if only one of the specified\n     * predicates are true.\n     * If the array of predicates is empty, then this predicate returns false.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  an array of predicates to check, may not be null\n     * @return the \u003ccode\u003eone\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     * @see OnePredicate\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.onePredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Create a new Predicate that returns true if only one of the specified\n     * predicates are true. The predicates are checked in iterator order.\n     * If the collection of predicates is empty, then this predicate returns false.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  a collection of predicates to check, may not be null\n     * @return the \u003ccode\u003eone\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates collection is null\n     * @throws NullPointerException if any predicate in the collection is null\n     * @see OnePredicate\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.neitherPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 402,
      "end_line": 407,
      "comment": "\n     * Create a new Predicate that returns true if neither of the specified\n     * predicates are true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate1  the first predicate, may not be null\n     * @param predicate2  the second predicate, may not be null\n     * @return the \u003ccode\u003eneither\u003c/code\u003e predicate\n     * @throws NullPointerException if either predicate is null\n     * @see NonePredicate\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 405,col 96)",
        "(line 406,col 9)-(line 406,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.nonePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Create a new Predicate that returns true if none of the specified\n     * predicates are true.\n     * If the array of predicates is empty, then this predicate returns true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  an array of predicates to check, may not be null\n     * @return the \u003ccode\u003enone\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates array is null\n     * @throws NullPointerException if any predicate in the array is null\n     * @see NonePredicate\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.nonePredicate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * Create a new Predicate that returns true if none of the specified\n     * predicates are true. The predicates are checked in iterator order.\n     * If the collection of predicates is empty, then this predicate returns true.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicates  a collection of predicates to check, may not be null\n     * @return the \u003ccode\u003enone\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicates collection is null\n     * @throws NullPointerException if any predicate in the collection is null\n     * @see NonePredicate\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.notPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * Create a new Predicate that returns true if the specified predicate\n     * returns false and vice versa.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate  the predicate to not\n     * @return the \u003ccode\u003enot\u003c/code\u003e predicate\n     * @throws NullPointerException if the predicate is null\n     * @see NotPredicate\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.asPredicate(org.apache.commons.collections4.Transformer\u003c? super T, java.lang.Boolean\u003e)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Create a new Predicate that wraps a Transformer. The Transformer must\n     * return either Boolean.TRUE or Boolean.FALSE otherwise a PredicateException\n     * will be thrown.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param transformer  the transformer to wrap, may not be null\n     * @return the transformer wrapping predicate\n     * @throws NullPointerException if the transformer is null\n     * @see TransformerPredicate\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.nullIsExceptionPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Gets a Predicate that throws an exception if the input object is null,\n     * otherwise it calls the specified Predicate. This allows null handling\n     * behaviour to be added to Predicates that don\u0027t support nulls.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate  the predicate to wrap, may not be null\n     * @return the predicate\n     * @throws NullPointerException if the predicate is null.\n     * @see NullIsExceptionPredicate\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.nullIsFalsePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Gets a Predicate that returns false if the input object is null, otherwise\n     * it calls the specified Predicate. This allows null handling behaviour to\n     * be added to Predicates that don\u0027t support nulls.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate  the predicate to wrap, may not be null\n     * @return the predicate\n     * @throws NullPointerException if the predicate is null.\n     * @see NullIsFalsePredicate\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.nullIsTruePredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Gets a Predicate that returns true if the input object is null, otherwise\n     * it calls the specified Predicate. This allows null handling behaviour to\n     * be added to Predicates that don\u0027t support nulls.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param predicate  the predicate to wrap, may not be null\n     * @return the predicate\n     * @throws NullPointerException if the predicate is null.\n     * @see NullIsTruePredicate\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.PredicateUtils.transformedPredicate(org.apache.commons.collections4.Transformer\u003c? super T, ? extends T\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 535,
      "end_line": 538,
      "comment": "\n     * Creates a predicate that transforms the input object before passing it\n     * to the predicate.\n     *\n     * @param \u003cT\u003e  the type that the predicate queries\n     * @param transformer  the transformer to call first\n     * @param predicate  the predicate to call with the result of the transform\n     * @return the predicate\n     * @throws NullPointerException if the transformer or the predicate is null\n     * @see TransformedPredicate\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 81)"
      ]
    }
  ]
}