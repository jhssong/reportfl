{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/FunctorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 207,
      "comment": "\n * Internal utilities for functors.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.FunctorUtils()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.copy(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Clone the predicates to ensure that the internal reference can\u0027t be messed with.\n     * Due to the {@link Predicate#evaluate(T)} method, Predicate\u003c? super T\u003e is\n     * able to be coerced to Predicate\u003cT\u003e without casting issues.\n     *\n     * @param predicates  the predicates to copy\n     * @return the cloned predicates\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.coerce(org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * A very simple method that coerces Predicate\u003c? super T\u003e to Predicate\u003cT\u003e.\n     * Due to the {@link Predicate#evaluate(T)} method, Predicate\u003c? super T\u003e is\n     * able to be coerced to Predicate\u003cT\u003e without casting issues.\n     * \u003cp\u003eThis method exists\n     * simply as centralised documentation and atomic unchecked warning\n     * suppression.\n     *\n     * @param \u003cT\u003e the type of object the returned predicate should \"accept\"\n     * @param predicate the predicate to coerce.\n     * @return the coerced predicate.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.validate(org.apache.commons.collections4.Predicate\u003c?\u003e...)",
      "begin_line": 78,
      "end_line": 88,
      "comment": "\n     * Validate the predicates to ensure that all is well.\n     *\n     * @param predicates  the predicates to validate\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.validate(java.util.Collection\u003c? extends org.apache.commons.collections4.Predicate\u003c? super T\u003e\u003e)",
      "begin_line": 96,
      "end_line": 113,
      "comment": "\n     * Validate the predicates to ensure that all is well.\n     *\n     * @param predicates  the predicates to validate\n     * @return predicate array\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 102,col 78)",
        "(line 103,col 9)-(line 103,col 18)",
        "(line 104,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.copy(org.apache.commons.collections4.Closure\u003c? super E\u003e...)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * Clone the closures to ensure that the internal reference can\u0027t be messed with.\n     *\n     * @param closures  the closures to copy\n     * @return the cloned closures\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.validate(org.apache.commons.collections4.Closure\u003c?\u003e...)",
      "begin_line": 134,
      "end_line": 144,
      "comment": "\n     * Validate the closures to ensure that all is well.\n     *\n     * @param closures  the closures to validate\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.coerce(org.apache.commons.collections4.Closure\u003c? super T\u003e)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * A very simple method that coerces Closure\u003c? super T\u003e to Closure\u003cT\u003e.\n     * \u003cp\u003eThis method exists\n     * simply as centralised documentation and atomic unchecked warning\n     * suppression.\n     *\n     * @param \u003cT\u003e the type of object the returned closure should \"accept\"\n     * @param closure the closure to coerce.\n     * @return the coerced closure.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.copy(org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e...)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * Copy method\n     *\n     * @param transformers  the transformers to copy\n     * @return a clone of the transformers\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.validate(org.apache.commons.collections4.Transformer\u003c?, ?\u003e...)",
      "begin_line": 180,
      "end_line": 190,
      "comment": "\n     * Validate method\n     *\n     * @param transformers  the transformers to validate\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FunctorUtils.coerce(org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * A very simple method that coerces Transformer\u003c? super I, ? extends O\u003e to Transformer\u003cI, O\u003e.\n     * \u003cp\u003eThis method exists\n     * simply as centralised documentation and atomic unchecked warning\n     * suppression.\n     *\n     * @param \u003cT\u003e the type of object the returned transformer should \"accept\"\n     * @param transformer the transformer to coerce.\n     * @return the coerced transformer.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 47)"
      ]
    }
  ]
}