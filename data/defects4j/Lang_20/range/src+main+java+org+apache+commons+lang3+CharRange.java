{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/CharRange.java",
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
      "end_line": 356,
      "comment": " to depend on Range."
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
      "comment": "\n     * \u003cp\u003eConstructs a {@code CharRange} over a set of characters,\n     * optionally negating the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf start and end are in the wrong order, they are reversed.\n     * Thus {@code a-e} is the same as {@code e-a}.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @param negated  true to express everything except the range\n     ",
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
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003eConstructs a {@code CharRange} over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNot(char)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eConstructs a negated {@code CharRange} over a single character.\u003c/p\u003e\n     *\n     * @param ch  only character in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isIn(char, char)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eConstructs a {@code CharRange} over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNotIn(char, char)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eConstructs a negated {@code CharRange} over a set of characters.\u003c/p\u003e\n     *\n     * @param start  first character, inclusive, in this range\n     * @param end  last character, inclusive, in this range\n     * @return the new CharRange object\n     * @see CharRange#CharRange(char, char, boolean)\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getStart()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eGets the start character for this character range.\u003c/p\u003e\n     * \n     * @return the start char (inclusive)\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.getEnd()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eGets the end character for this character range.\u003c/p\u003e\n     * \n     * @return the end char (inclusive)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.isNegated()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eIs this {@code CharRange} negated.\u003c/p\u003e\n     * \n     * \u003cp\u003eA negated range includes everything except that defined by the\n     * start and end characters.\u003c/p\u003e\n     *\n     * @return {@code true} if negated\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(char)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eIs the character specified contained in this range.\u003c/p\u003e\n     *\n     * @param ch  the character to check\n     * @return {@code true} if this range contains the input character\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.contains(org.apache.commons.lang3.CharRange)",
      "begin_line": 182,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eAre all the characters of the passed in range contained in\n     * this range.\u003c/p\u003e\n     *\n     * @param range  the range to check against\n     * @return {@code true} if this range entirely contains the input range\n     * @throws IllegalArgumentException if {@code null} input\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.equals(java.lang.Object)",
      "begin_line": 207,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eCompares two CharRange objects, returning true if they represent\n     * exactly the same range of characters defined in the same way.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 42)",
        "(line 216,col 9)-(line 216,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.hashCode()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * \u003cp\u003eGets a hashCode compatible with the equals method.\u003c/p\u003e\n     * \n     * @return a suitable hashCode\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.toString()",
      "begin_line": 234,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eGets a string representation of the character range.\u003c/p\u003e\n     * \n     * @return string representation of this range\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.iterator()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eReturns an iterator which can be used to walk through the characters described by this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e#NotThreadSafe# the iterator is not threadsafe\u003c/p\u003e\n     * @return an iterator to the chars represented by this range\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharacterIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Character\u003e"
      ],
      "begin_line": 268,
      "end_line": 355,
      "comment": "\n     * Character {@link Iterator}.\n     * \u003cp\u003e#NotThreadSafe#\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " The current character "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasNext"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.CharacterIterator(org.apache.commons.lang3.CharRange)",
      "begin_line": 280,
      "end_line": 298,
      "comment": "\n         * Construct a new iterator for the character range.\n         *\n         * @param r The character range\n         ",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 22)",
        "(line 282,col 13)-(line 282,col 27)",
        "(line 284,col 13)-(line 297,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.prepareNext()",
      "begin_line": 303,
      "end_line": 321,
      "comment": "\n         * Prepare the next character in the range.\n         ",
      "child_ranges": [
        "(line 304,col 13)-(line 320,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.hasNext()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n         * Has the iterator not reached the end character yet?\n         *\n         * @return {@code true} if the iterator has yet to reach the character date\n         ",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.next()",
      "begin_line": 337,
      "end_line": 344,
      "comment": "\n         * Return the next character in the iteration\n         *\n         * @return {@code Character} for the next character\n         ",
      "child_ranges": [
        "(line 338,col 13)-(line 340,col 13)",
        "(line 341,col 13)-(line 341,col 31)",
        "(line 342,col 13)-(line 342,col 26)",
        "(line 343,col 13)-(line 343,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharRange.CharacterIterator.remove()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         *\n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 353,col 13)-(line 353,col 54)"
      ]
    }
  ]
}