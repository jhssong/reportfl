{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/comparators/BooleanComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BooleanComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cjava.lang.Boolean\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 192,
      "comment": "\n * A {@link Comparator} for {@link Boolean} objects that can sort either\n * true or false first.\n * \u003cp\u003e\n * @see #getTrueFirstComparator()\n * @see #getFalseFirstComparator()\n * @see #booleanComparator(boolean)\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "TRUE_FIRST"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Constant \"true first\" reference. "
    },
    {
      "type": "field",
      "varNames": [
        "FALSE_FIRST"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Constant \"false first\" reference. "
    },
    {
      "type": "field",
      "varNames": [
        "trueFirst"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " \u003ccode\u003etrue\u003c/code\u003e iff \u003ccode\u003etrue\u003c/code\u003e values sort before \u003ccode\u003efalse\u003c/code\u003e values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.getTrueFirstComparator()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Returns a BooleanComparator instance that sorts\n     * \u003ccode\u003etrue\u003c/code\u003e values before \u003ccode\u003efalse\u003c/code\u003e values.\n     * \u003cp /\u003e\n     * Clients are encouraged to use the value returned from\n     * this method instead of constructing a new instance\n     * to reduce allocation and garbage collection overhead when\n     * multiple BooleanComparators may be used in the same\n     * virtual machine.\n     *\n     * @return the true first singleton BooleanComparator\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.getFalseFirstComparator()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns a BooleanComparator instance that sorts\n     * \u003ccode\u003efalse\u003c/code\u003e values before \u003ccode\u003etrue\u003c/code\u003e values.\n     * \u003cp /\u003e\n     * Clients are encouraged to use the value returned from\n     * this method instead of constructing a new instance\n     * to reduce allocation and garbage collection overhead when\n     * multiple BooleanComparators may be used in the same\n     * virtual machine.\n     *\n     * @return the false first singleton BooleanComparator\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.booleanComparator(boolean)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns a BooleanComparator instance that sorts\n     * \u003ccode\u003e\u003ci\u003etrueFirst\u003c/i\u003e\u003c/code\u003e values before\n     * \u003ccode\u003e\u0026#x21;\u003ci\u003etrueFirst\u003c/i\u003e\u003c/code\u003e values.\n     * \u003cp /\u003e\n     * Clients are encouraged to use the value returned from\n     * this method instead of constructing a new instance\n     * to reduce allocation and garbage collection overhead when\n     * multiple BooleanComparators may be used in the same\n     * virtual machine.\n     *\n     * @param trueFirst when \u003ccode\u003etrue\u003c/code\u003e, sort\n     * \u003ccode\u003etrue\u003c/code\u003e \u003ccode\u003eBoolean\u003c/code\u003es before \u003ccode\u003efalse\u003c/code\u003e\n     * @return a singleton BooleanComparator instance\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.BooleanComparator()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Creates a \u003ccode\u003eBooleanComparator\u003c/code\u003e that sorts\n     * \u003ccode\u003efalse\u003c/code\u003e values before \u003ccode\u003etrue\u003c/code\u003e values.\n     * \u003cp\u003e\n     * Equivalent to {@link #BooleanComparator(boolean) BooleanComparator(false)}.\n     * \u003cp\u003e\n     * Please use the static factory instead whenever possible.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.BooleanComparator(boolean)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Creates a \u003ccode\u003eBooleanComparator\u003c/code\u003e that sorts\n     * \u003ccode\u003e\u003ci\u003etrueFirst\u003c/i\u003e\u003c/code\u003e values before\n     * \u003ccode\u003e\u0026#x21;\u003ci\u003etrueFirst\u003c/i\u003e\u003c/code\u003e values.\n     * \u003cp\u003e\n     * Please use the static factories instead whenever possible.\n     *\n     * @param trueFirst when \u003ccode\u003etrue\u003c/code\u003e, sort\n     *  \u003ccode\u003etrue\u003c/code\u003e boolean values before \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.compare(java.lang.Boolean, java.lang.Boolean)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\n     * Compares two non-\u003ccode\u003enull\u003c/code\u003e \u003ccode\u003eBoolean\u003c/code\u003e objects\n     * according to the value of {@link #sortsTrueFirst()}.\n     *\n     * @param b1  the first boolean to compare\n     * @param b2  the second boolean to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     * @throws NullPointerException when either argument \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 142,col 9)-(line 142,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.hashCode()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a hash code for this comparator.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 56)",
        "(line 155,col 9)-(line 155,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.equals(java.lang.Object)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is\n     * is a {@link Comparator} whose ordering is known to be\n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003ethat\u003c/i\u003e\u003c/code\u003e is a {@link BooleanComparator}\n     * whose value of {@link #sortsTrueFirst()} is equal to mine.\n     *\n     * @param object  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.BooleanComparator.sortsTrueFirst()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff\n     * I sort \u003ccode\u003etrue\u003c/code\u003e values before\n     * \u003ccode\u003efalse\u003c/code\u003e values.  In other words,\n     * returns \u003ccode\u003etrue\u003c/code\u003e iff\n     * {@link #compare(Boolean,Boolean) compare(Boolean.FALSE,Boolean.TRUE)}\n     * returns a positive value.\n     *\n     * @return the trueFirst flag\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 25)"
      ]
    }
  ]
}