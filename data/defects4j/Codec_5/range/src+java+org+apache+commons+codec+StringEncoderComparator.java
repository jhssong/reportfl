{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/StringEncoderComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringEncoderComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 34,
      "end_line": 86,
      "comment": "\n * Strings are comparable, and this comparator allows \n * you to configure it with an instance of a class\n * which implements StringEncoder.  This comparator\n * is used to sort Strings by an encoding scheme such\n * as Soundex, Metaphone, etc.  This class can come in\n * handy if one need to sort Strings by an encoded\n * form of a name such as Soundex.\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "stringEncoder"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Internal encoder instance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.StringEncoderComparator.StringEncoderComparator()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Constructs a new instance.\n     * @deprecated as creating without a StringEncoder will lead to a \n     *             broken NullPointerException creating comparator.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.StringEncoderComparator.StringEncoderComparator(org.apache.commons.codec.StringEncoder)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructs a new instance with the given algorithm.\n     * @param stringEncoder the StringEncoder used for comparisons.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.StringEncoderComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 71,
      "end_line": 84,
      "comment": "\n     * Compares two strings based not on the strings \n     * themselves, but on an encoding of the two \n     * strings using the StringEncoder this Comparator\n     * was created with.\n     * \n     * If an {@link EncoderException} is encountered, return \u003ccode\u003e0\u003c/code\u003e.\n     * \n     * @param o1 the object to compare\n     * @param o2 the object to compare to\n     * @return the Comparable.compareTo() return code or 0 if an encoding error was caught.\n     * @see Comparable\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 75,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 27)"
      ]
    }
  ]
}