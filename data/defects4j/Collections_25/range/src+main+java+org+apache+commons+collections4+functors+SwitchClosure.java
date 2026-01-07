{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/SwitchClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 185,
      "comment": "\n * Closure implementation calls the closure whose predicate returns true,\n * like a switch statement.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iPredicates"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The tests to consider "
    },
    {
      "type": "field",
      "varNames": [
        "iClosures"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The matching closures to call "
    },
    {
      "type": "field",
      "varNames": [
        "iDefault"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The default closure to call if no tests match "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.switchClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 55,
      "end_line": 68,
      "comment": "\n     * Factory method that performs validation and copies the parameter arrays.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param predicates  array of predicates, cloned, no nulls\n     * @param closures  matching array of closures, cloned, no nulls\n     * @param defaultClosure  the closure to use if no match, null means nop\n     * @return the \u003ccode\u003echained\u003c/code\u003e closure\n     * @throws IllegalArgumentException if array is null\n     * @throws IllegalArgumentException if any element in the array is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 42)",
        "(line 60,col 9)-(line 60,col 40)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.switchClosure(java.util.Map\u003corg.apache.commons.collections4.Predicate\u003cE\u003e, org.apache.commons.collections4.Closure\u003cE\u003e\u003e)",
      "begin_line": 88,
      "end_line": 108,
      "comment": "\n     * Create a new Closure that calls one of the closures depending\n     * on the predicates.\n     * \u003cp\u003e\n     * The Map consists of Predicate keys and Closure values. A closure\n     * is called if its matching predicate returns true. Each predicate is evaluated\n     * until one returns true. If no predicates evaluate to true, the default\n     * closure is called. The default closure is set in the map with a\n     * null key. The ordering is that of the iterator() method on the entryset\n     * collection of the map.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @param predicatesAndClosures  a map of predicates to closures\n     * @return the \u003ccode\u003eswitch\u003c/code\u003e closure\n     * @throws IllegalArgumentException if the map is null\n     * @throws IllegalArgumentException if any closure in the map is null\n     * @throws ClassCastException  if the map elements are of the wrong type\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 85)",
        "(line 95,col 9)-(line 95,col 54)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 56)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 101,col 18)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.SwitchClosure(boolean, org.apache.commons.collections4.Predicate\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\n     * Hidden constructor for the use by the static factory methods.\n     *\n     * @param clone  if {@code true} the input arguments will be cloned\n     * @param predicates  array of predicates, no nulls\n     * @param closures  matching array of closures, no nulls\n     * @param defaultClosure  the closure to use if no match, null means nop\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 16)",
        "(line 122,col 9)-(line 122,col 73)",
        "(line 123,col 9)-(line 123,col 67)",
        "(line 124,col 9)-(line 124,col 111)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.SwitchClosure(org.apache.commons.collections4.Predicate\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e[], org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eswitchClosure\u003c/code\u003e if you want that.\n     *\n     * @param predicates  array of predicates, cloned, no nulls\n     * @param closures  matching array of closures, cloned, no nulls\n     * @param defaultClosure  the closure to use if no match, null means nop\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.execute(E)",
      "begin_line": 145,
      "end_line": 153,
      "comment": "\n     * Executes the closure whose matching predicate returns true\n     *\n     * @param input  the input object\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.getPredicates()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Gets the predicates.\n     *\n     * @return a copy of the predicates\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.getClosures()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Gets the closures.\n     *\n     * @return a copy of the closures\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.SwitchClosure.getDefaultClosure()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Gets the default closure.\n     *\n     * @return the default closure\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 24)"
      ]
    }
  ]
}