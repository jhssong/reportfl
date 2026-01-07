{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/CharRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRange",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cjava.lang.Character\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 349,
      "comment": "\n * \u003cp\u003eA contiguous range of characters, optionally negated.\u003c/p\u003e\n * \n * \u003cp\u003eInstances are immutable.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Chris Feldhacker\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Required for serialization support. Lang version 2.0. \n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The first character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The last character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "negated"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " True if the range is everything except the characters specified. "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Cached toString. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharRange.CharRange(char, char, boolean)",
      "begin_line": 67,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus \u003ccode\u003ea-e\u003c/code\u003e is the same as \u003ccode\u003ee-a\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)",
        "(line 69,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 23)",
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.is(char)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNot(char)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003eConstructs a negated \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isIn(char, char)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNotIn(char, char)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eConstructs a negated \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getStart()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getEnd()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNegated()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003eIs this \u003ccode\u003eCharRange\u003c/code\u003e negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e is negated\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(char)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range contains the input character\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(org.apache.commons.lang3.CharRange)",
      "begin_line": 178,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range entirely contains the input range\n     * @throws IllegalArgumentException if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.equals(java.lang.Object)",
      "begin_line": 203,
      "end_line": 213,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 212,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.hashCode()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.toString()",
      "begin_line": 230,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.iterator()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eReturns an iterator which can be used to walk through the characters described by this range.\u003c/p\u003e\n     *\n     * @return an iterator to the chars represented by this range\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharacterIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Character\u003e"
      ],
      "begin_line": 261,
      "end_line": 348,
      "comment": "\n     * Character {@link Iterator}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " The current character "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasNext"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.CharacterIterator(org.apache.commons.lang3.CharRange)",
      "begin_line": 273,
      "end_line": 291,
      "comment": "\n         * Construct a new iterator for the character range.\n         *\n         * @param r The character range\n         ",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 22)",
        "(line 275,col 13)-(line 275,col 27)",
        "(line 277,col 13)-(line 290,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.prepareNext()",
      "begin_line": 296,
      "end_line": 314,
      "comment": "\n         * Prepare the next character in the range.\n         ",
      "child_ranges": [
        "(line 297,col 13)-(line 313,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.hasNext()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n         * Has the iterator not reached the end character yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the character date\n         ",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.next()",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\n         * Return the next character in the iteration\n         *\n         * @return \u003ccode\u003eCharacter\u003c/code\u003e for the next character\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 333,col 13)",
        "(line 334,col 13)-(line 334,col 31)",
        "(line 335,col 13)-(line 335,col 26)",
        "(line 336,col 13)-(line 336,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.remove()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         *\n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 54)"
      ]
    }
  ]
}