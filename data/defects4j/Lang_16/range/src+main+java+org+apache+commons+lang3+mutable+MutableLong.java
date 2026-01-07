{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/mutable/MutableLong.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableLong",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableLong\u003e",
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 28,
      "end_line": 273,
      "comment": "\n * A mutable \u003ccode\u003elong\u003c/code\u003e wrapper.\n * \u003cp\u003e\n * Note that as MutableLong does not extend Long, it is not treated by String.format as a Long parameter. \n * \n * @see Long\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.MutableLong()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new MutableLong with the default value of zero.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.MutableLong(long)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructs a new MutableLong with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.MutableLong(java.lang.Number)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructs a new MutableLong with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.MutableLong(java.lang.String)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Constructs a new MutableLong parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into a long\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.getValue()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Gets the value as a Long instance.\n     * \n     * @return the value as a Long, never null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.setValue(long)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.setValue(java.lang.Number)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.increment()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.decrement()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.add(long)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.add(java.lang.Number)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.subtract(long)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.subtract(java.lang.Number)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.intValue()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Returns the value of this MutableLong as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.longValue()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Returns the value of this MutableLong as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.floatValue()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Returns the value of this MutableLong as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.doubleValue()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Returns the value of this MutableLong as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.toLong()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Gets this mutable as an instance of Long.\n     *\n     * @return a Long instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.equals(java.lang.Object)",
      "begin_line": 232,
      "end_line": 238,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableLong\u003c/code\u003e object that contains the same \u003ccode\u003elong\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.hashCode()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.compareTo(org.apache.commons.lang3.mutable.MutableLong)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 38)",
        "(line 259,col 9)-(line 259,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableLong.toString()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 37)"
      ]
    }
  ]
}