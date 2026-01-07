{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/CharSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSet",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 299,
      "comment": "\n * \u003cp\u003eA set of characters.\u003c/p\u003e\n *\n * \u003cp\u003eInstances are immutable, but instances of subclasses may not be.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Phil Steitz\n * @author Pete Gieser\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Required for serialization support. Lang version 2.0. \n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " \n     * A CharSet defining no characters. \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_ALPHA"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"a-zA-Z\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_ALPHA_LOWER"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"a-z\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_ALPHA_UPPER"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"A-Z\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ASCII_NUMERIC"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " \n     * A CharSet defining ASCII alphabetic characters \"0-9\".\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COMMON"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * A Map of the common cases used in the factory.\n     * Subclasses can add more common patterns if desired.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The set of CharRange objects. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.getInstance(java.lang.String)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n     * \u003cp\u003eFactory method to create a new CharSet using a special syntax.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003enull\u003c/code\u003e or empty string (\"\")\n     * - set containing no characters\u003c/li\u003e\n     *  \u003cli\u003eSingle character, such as \"a\"\n     *  - set containing just that character\u003c/li\u003e\n     *  \u003cli\u003eMulti character, such as \"a-e\"\n     *  - set containing characters from one character to the other\u003c/li\u003e\n     *  \u003cli\u003eNegated, such as \"^a\" or \"^a-e\"\n     *  - set containing all characters except those defined\u003c/li\u003e\n     *  \u003cli\u003eCombinations, such as \"abe-g\"\n     *  - set containing all the characters from the individual sets\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eThe matching order is:\u003c/p\u003e\n     * \u003col\u003e\n     *  \u003cli\u003eNegated multi character range, such as \"^a-e\"\n     *  \u003cli\u003eOrdinary multi character range, such as \"a-e\"\n     *  \u003cli\u003eNegated single character, such as \"^a\"\n     *  \u003cli\u003eOrdinary single character, such as \"a\"\n     * \u003c/ol\u003e\n     * \u003cp\u003eMatching works left to right. Once a match is found the\n     * search starts again from the next character.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the same range is defined twice using the same syntax, only\n     * one range will be kept.\n     * Thus, \"a-ca-c\" creates only one range of \"a-c\".\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the start and end of a range are in the wrong order,\n     * they are reversed. Thus \"a-e\" is the same as \"e-a\".\n     * As a result, \"a-ee-a\" would create only one range,\n     * as the \"a-e\" and \"e-a\" are the same.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe set of characters represented is the union of the specified ranges.\u003c/p\u003e\n     *\n     * \u003cp\u003eAll CharSet objects returned by this method will be immutable.\u003c/p\u003e\n     *\n     * @param setStr  the String describing the set, may be null\n     * @return a CharSet instance\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.getInstance(java.lang.String[])",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eConstructs a new CharSet using the set syntax.\n     * Each string is merged in with the set.\u003c/p\u003e\n     *\n     * @param setStrs  Strings to merge into the initial set, may be null\n     * @return a CharSet instance\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharSet.CharSet(java.lang.String)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eConstructs a new CharSet using the set syntax.\u003c/p\u003e\n     *\n     * @param setStr  the String describing the set, may be null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 16)",
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharSet.CharSet(java.lang.String[])",
      "begin_line": 182,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eConstructs a new CharSet using the set syntax.\n     * Each string is merged in with the set.\u003c/p\u003e\n     *\n     * @param set  Strings to merge into the initial set\n     * @throws NullPointerException if set is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 16)",
        "(line 184,col 9)-(line 184,col 28)",
        "(line 185,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.add(java.lang.String)",
      "begin_line": 196,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eAdd a set definition string to the \u003ccode\u003eCharSet\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  set definition string\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 31)",
        "(line 202,col 9)-(line 202,col 20)",
        "(line 203,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.getCharRanges()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * \u003cp\u003eGets the internal set as an array of CharRange objects.\u003c/p\u003e\n     *\n     * @return an array of immutable CharRange objects\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.contains(char)",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eDoes the \u003ccode\u003eCharSet\u003c/code\u003e contain the specified\n     * character \u003ccode\u003ech\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param ch  the character to check for\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the set contains the characters\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.equals(java.lang.Object)",
      "begin_line": 266,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eCompares two CharSet objects, returning true if they represent\n     * exactly the same set of characters defined in the same way.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe two sets \u003ccode\u003eabc\u003c/code\u003e and \u003ccode\u003ea-c\u003c/code\u003e are \u003ci\u003enot\u003c/i\u003e\n     * equal according to this method.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 38)",
        "(line 275,col 9)-(line 275,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.hashCode()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     *\n     * @return a suitable hashCode\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSet.toString()",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eGets a string representation of the set.\u003c/p\u003e\n     *\n     * @return string representation of the set\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 30)"
      ]
    }
  ]
}