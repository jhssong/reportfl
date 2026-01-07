{
  "filepath": "/tmp/Codec-11b/src/main/java/org/apache/commons/codec/StringEncoderComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEncoderComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 30,
      "end_line": 84,
      "comment": "\n * Compares Strings using a {@link StringEncoder}. This comparator is used to sort Strings by an encoding scheme such as\n * Soundex, Metaphone, etc. This class can come in handy if one need to sort Strings by an encoded form of a name such\n * as Soundex.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stringEncoder"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Internal encoder instance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.StringEncoderComparator.StringEncoderComparator()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new instance.\n     * \n     * @deprecated Creating an instance without a {@link StringEncoder} leads to a {@link NullPointerException}. Will be\n     *             removed in 2.0.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.StringEncoderComparator.StringEncoderComparator(org.apache.commons.codec.StringEncoder)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructs a new instance with the given algorithm.\n     * \n     * @param stringEncoder\n     *            the StringEncoder used for comparisons.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.StringEncoderComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 70,
      "end_line": 82,
      "comment": "\n     * Compares two strings based not on the strings themselves, but on an encoding of the two strings using the\n     * StringEncoder this Comparator was created with.\n     * \n     * If an {@link EncoderException} is encountered, return \u003ccode\u003e0\u003c/code\u003e.\n     * \n     * @param o1\n     *            the object to compare\n     * @param o2\n     *            the object to compare to\n     * @return the Comparable.compareTo() return code or 0 if an encoding error was caught.\n     * @see Comparable\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 28)",
        "(line 74,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 27)"
      ]
    }
  ]
}