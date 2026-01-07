{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/comparators/NullComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 181,
      "comment": "\n * A Comparator that will compare nulls to be either lower or higher than\n * other objects.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "nonNullComparator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     *  The comparator to use when comparing two non-\u003ccode\u003enull\u003c/code\u003e objects.\n     *"
    },
    {
      "type": "field",
      "varNames": [
        "nullsAreHigh"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     *  Specifies whether a \u003ccode\u003enull\u003c/code\u003e are compared as higher than\n     *  non-\u003ccode\u003enull\u003c/code\u003e objects.\n     *"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.NullComparator()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     *  Construct an instance that sorts \u003ccode\u003enull\u003c/code\u003e higher than any\n     *  non-\u003ccode\u003enull\u003c/code\u003e object it is compared with. When comparing two\n     *  non-\u003ccode\u003enull\u003c/code\u003e objects, the {@link ComparableComparator} is\n     *  used.\n     *",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.NullComparator(java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     *  Construct an instance that sorts \u003ccode\u003enull\u003c/code\u003e higher than any\n     *  non-\u003ccode\u003enull\u003c/code\u003e object it is compared with.  When comparing two\n     *  non-\u003ccode\u003enull\u003c/code\u003e objects, the specified {@link Comparator} is\n     *  used.\n     *\n     *  @param nonNullComparator the comparator to use when comparing two\n     *  non-\u003ccode\u003enull\u003c/code\u003e objects.  This argument cannot be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     *\n     *  @throws NullPointerException if \u003ccode\u003enonNullComparator\u003c/code\u003e is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     *",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.NullComparator(boolean)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     *  Construct an instance that sorts \u003ccode\u003enull\u003c/code\u003e higher or lower than\n     *  any non-\u003ccode\u003enull\u003c/code\u003e object it is compared with.  When comparing\n     *  two non-\u003ccode\u003enull\u003c/code\u003e objects, the {@link ComparableComparator} is\n     *  used.\n     *\n     *  @param nullsAreHigh a \u003ccode\u003etrue\u003c/code\u003e value indicates that\n     *  \u003ccode\u003enull\u003c/code\u003e should be compared as higher than a\n     *  non-\u003ccode\u003enull\u003c/code\u003e object.  A \u003ccode\u003efalse\u003c/code\u003e value indicates\n     *  that \u003ccode\u003enull\u003c/code\u003e should be compared as lower than a\n     *  non-\u003ccode\u003enull\u003c/code\u003e object.\n     *",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.NullComparator(java.util.Comparator\u003c? super E\u003e, boolean)",
      "begin_line": 112,
      "end_line": 119,
      "comment": "\n     *  Construct an instance that sorts \u003ccode\u003enull\u003c/code\u003e higher or lower than\n     *  any non-\u003ccode\u003enull\u003c/code\u003e object it is compared with.  When comparing\n     *  two non-\u003ccode\u003enull\u003c/code\u003e objects, the specified {@link Comparator} is\n     *  used.\n     *\n     *  @param nonNullComparator the comparator to use when comparing two\n     *  non-\u003ccode\u003enull\u003c/code\u003e objects. This argument cannot be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     *\n     *  @param nullsAreHigh a \u003ccode\u003etrue\u003c/code\u003e value indicates that\n     *  \u003ccode\u003enull\u003c/code\u003e should be compared as higher than a\n     *  non-\u003ccode\u003enull\u003c/code\u003e object.  A \u003ccode\u003efalse\u003c/code\u003e value indicates\n     *  that \u003ccode\u003enull\u003c/code\u003e should be compared as lower than a\n     *  non-\u003ccode\u003enull\u003c/code\u003e object.\n     *\n     *  @throws NullPointerException if \u003ccode\u003enonNullComparator\u003c/code\u003e is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     *",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 41)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.compare(E, E)",
      "begin_line": 138,
      "end_line": 144,
      "comment": "\n     *  Perform a comparison between two objects.  If both objects are\n     *  \u003ccode\u003enull\u003c/code\u003e, a \u003ccode\u003e0\u003c/code\u003e value is returned.  If one object\n     *  is \u003ccode\u003enull\u003c/code\u003e and the other is not, the result is determined on\n     *  whether the Comparator was constructed to have nulls as higher or lower\n     *  than other objects.  If neither object is \u003ccode\u003enull\u003c/code\u003e, an\n     *  underlying comparator specified in the constructor (or the default) is\n     *  used to compare the non-\u003ccode\u003enull\u003c/code\u003e objects.\n     *\n     *  @param o1  the first object to compare\n     *  @param o2  the object to compare it to.\n     *  @return \u003ccode\u003e-1\u003c/code\u003e if \u003ccode\u003eo1\u003c/code\u003e is \"lower\" than (less than,\n     *  before, etc.) \u003ccode\u003eo2\u003c/code\u003e; \u003ccode\u003e1\u003c/code\u003e if \u003ccode\u003eo1\u003c/code\u003e is\n     *  \"higher\" than (greater than, after, etc.) \u003ccode\u003eo2\u003c/code\u003e; or\n     *  \u003ccode\u003e0\u003c/code\u003e if \u003ccode\u003eo1\u003c/code\u003e and \u003ccode\u003eo2\u003c/code\u003e are equal.\n     *",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 61)",
        "(line 142,col 9)-(line 142,col 61)",
        "(line 143,col 9)-(line 143,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.hashCode()",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     *  Implement a hash code for this comparator that is consistent with\n     *  {@link #equals(Object)}.\n     *\n     *  @return a hash code for this comparator.\n     *",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.NullComparator.equals(java.lang.Object)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "\n     *  Determines whether the specified object represents a comparator that is\n     *  equal to this comparator.\n     *\n     *  @param obj  the object to compare this comparator with.\n     *\n     *  @return \u003ccode\u003etrue\u003c/code\u003e if the specified object is a NullComparator\n     *  with equivalent \u003ccode\u003enull\u003c/code\u003e comparison behavior\n     *  (i.e. \u003ccode\u003enull\u003c/code\u003e high or low) and with equivalent underlying\n     *  non-\u003ccode\u003enull\u003c/code\u003e object comparators.\n     *",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 41)",
        "(line 172,col 9)-(line 172,col 40)",
        "(line 173,col 9)-(line 173,col 69)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 177,col 9)-(line 178,col 71)"
      ]
    }
  ]
}