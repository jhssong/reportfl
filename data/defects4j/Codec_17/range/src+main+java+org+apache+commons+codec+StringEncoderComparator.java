{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/StringEncoderComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "// TODO ought to implement Comparator\u003cString\u003e but that\u0027s not possible whilst maintaining binary compatibility.\nStringEncoderComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 31,
      "end_line": 91,
      "comment": "\n * Compares Strings using a {@link StringEncoder}. This comparator is used to sort Strings by an encoding scheme such as\n * Soundex, Metaphone, etc. This class can come in handy if one need to sort Strings by an encoded form of a name such\n * as Soundex.\n *\n * \u003cp\u003eThis class is immutable and thread-safe.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stringEncoder"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Internal encoder instance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.StringEncoderComparator.StringEncoderComparator()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Constructs a new instance.\n     *\n     * @deprecated Creating an instance without a {@link StringEncoder} leads to a {@link NullPointerException}. Will be\n     *             removed in 2.0.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.StringEncoderComparator.StringEncoderComparator(org.apache.commons.codec.StringEncoder)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Constructs a new instance with the given algorithm.\n     *\n     * @param stringEncoder\n     *            the StringEncoder used for comparisons.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.StringEncoderComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 74,
      "end_line": 89,
      "comment": "\n     * Compares two strings based not on the strings themselves, but on an encoding of the two strings using the\n     * StringEncoder this Comparator was created with.\n     *\n     * If an {@link EncoderException} is encountered, return \u003ccode\u003e0\u003c/code\u003e.\n     *\n     * @param o1\n     *            the object to compare\n     * @param o2\n     *            the object to compare to\n     * @return the Comparable.compareTo() return code or 0 if an encoding error was caught.\n     * @see Comparable\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 28)",
        "(line 79,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 27)"
      ]
    }
  ]
}