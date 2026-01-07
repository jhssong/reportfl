{
  "filepath": "/tmp/Lang-28b/src/main/java/org/apache/commons/lang3/CharRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRange",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cjava.lang.Character\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 357,
      "comment": "\n * \u003cp\u003eA contiguous range of characters, optionally negated.\u003c/p\u003e\n * \n * \u003cp\u003eInstances are immutable.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @author Chris Feldhacker\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Required for serialization support. Lang version 2.0. \n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The first character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The last character, inclusive, in the range. "
    },
    {
      "type": "field",
      "varNames": [
        "negated"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " True if the range is everything except the characters specified. "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached toString. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharRange.CharRange(char, char, boolean)",
      "begin_line": 68,
      "end_line": 79,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus \u003ccode\u003ea-e\u003c/code\u003e is the same as \u003ccode\u003ee-a\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 23)",
        "(line 78,col 9)-(line 78,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.is(char)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNot(char)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003eConstructs a negated \u003ccode\u003eCharRange\u003c/code\u003e over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isIn(char, char)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNotIn(char, char)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eConstructs a negated \u003ccode\u003eCharRange\u003c/code\u003e over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getStart()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getEnd()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNegated()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eIs this \u003ccode\u003eCharRange\u003c/code\u003e negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e is negated\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(char)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range contains the input character\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(org.apache.commons.lang3.CharRange)",
      "begin_line": 183,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this range entirely contains the input range\n     * @throws IllegalArgumentException if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.equals(java.lang.Object)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 42)",
        "(line 217,col 9)-(line 217,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.hashCode()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.toString()",
      "begin_line": 235,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.iterator()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eReturns an iterator which can be used to walk through the characters described by this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e#NotThreadSafe# the iterator is not threadsafe\u003c/p\u003e\n     * @return an iterator to the chars represented by this range\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharacterIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Character\u003e"
      ],
      "begin_line": 269,
      "end_line": 356,
      "comment": "\n     * Character {@link Iterator}.\n     * \u003cp\u003e#NotThreadSafe#\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " The current character "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasNext"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.CharacterIterator(org.apache.commons.lang3.CharRange)",
      "begin_line": 281,
      "end_line": 299,
      "comment": "\n         * Construct a new iterator for the character range.\n         *\n         * @param r The character range\n         ",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 22)",
        "(line 283,col 13)-(line 283,col 27)",
        "(line 285,col 13)-(line 298,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.prepareNext()",
      "begin_line": 304,
      "end_line": 322,
      "comment": "\n         * Prepare the next character in the range.\n         ",
      "child_ranges": [
        "(line 305,col 13)-(line 321,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.hasNext()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n         * Has the iterator not reached the end character yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the character date\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.next()",
      "begin_line": 338,
      "end_line": 345,
      "comment": "\n         * Return the next character in the iteration\n         *\n         * @return \u003ccode\u003eCharacter\u003c/code\u003e for the next character\n         ",
      "child_ranges": [
        "(line 339,col 13)-(line 341,col 13)",
        "(line 342,col 13)-(line 342,col 31)",
        "(line 343,col 13)-(line 343,col 26)",
        "(line 344,col 13)-(line 344,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.remove()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         *\n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 54)"
      ]
    }
  ]
}