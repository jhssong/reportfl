{
  "filepath": "/tmp/Lang-26b/src/main/java/org/apache/commons/lang3/mutable/MutableShort.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MutableShort",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.mutable.MutableShort\u003e",
        "org.apache.commons.lang3.mutable.Mutable\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 27,
      "end_line": 282,
      "comment": "\n * A mutable \u003ccode\u003eshort\u003c/code\u003e wrapper.\n * \n * @see Short\n * @since 2.1\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The mutable value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new MutableShort with the default value of zero.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort(short)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value  the initial value to store\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort(java.lang.Number)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a new MutableShort with the specified value.\n     * \n     * @param value  the initial value to store, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.MutableShort(java.lang.String)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Constructs a new MutableShort parsing the given string.\n     * \n     * @param value  the string to parse, not null\n     * @throws NumberFormatException if the string cannot be parsed into a short\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.getValue()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Gets the value as a Short instance.\n     * \n     * @return the value as a Short, never null\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.setValue(short)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Sets the value.\n     * \n     * @param value  the value to set\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.setValue(java.lang.Number)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Sets the value from any Number instance.\n     * \n     * @param value  the value to set, not null\n     * @throws NullPointerException if the object is null\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.increment()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Increments the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.decrement()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Decrements the value.\n     *\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.add(short)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.add(java.lang.Number)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Adds a value to the value of this instance.\n     * \n     * @param operand  the value to add, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.subtract(short)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.subtract(java.lang.Number)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Subtracts a value from the value of this instance.\n     * \n     * @param operand  the value to subtract, not null\n     * @throws NullPointerException if the object is null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.shortValue()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Returns the value of this MutableShort as a short.\n     *\n     * @return the numeric value represented by this object after conversion to type short.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.intValue()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * Returns the value of this MutableShort as an int.\n     *\n     * @return the numeric value represented by this object after conversion to type int.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.longValue()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Returns the value of this MutableShort as a long.\n     *\n     * @return the numeric value represented by this object after conversion to type long.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.floatValue()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Returns the value of this MutableShort as a float.\n     *\n     * @return the numeric value represented by this object after conversion to type float.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.doubleValue()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Returns the value of this MutableShort as a double.\n     *\n     * @return the numeric value represented by this object after conversion to type double.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.toShort()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Gets this mutable as an instance of Short.\n     *\n     * @return a Short instance containing the value from this mutable, never null\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.equals(java.lang.Object)",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\n     * Compares this object to the specified object. The result is \u003ccode\u003etrue\u003c/code\u003e if and only if the argument\n     * is not \u003ccode\u003enull\u003c/code\u003e and is a \u003ccode\u003eMutableShort\u003c/code\u003e object that contains the same \u003ccode\u003eshort\u003c/code\u003e\n     * value as this object.\n     * \n     * @param obj  the object to compare with, null returns false\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the objects are the same; \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.hashCode()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Returns a suitable hash code for this mutable.\n     * \n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.compareTo(org.apache.commons.lang3.mutable.MutableShort)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * Compares this mutable to another in ascending order.\n     * \n     * @param other  the other mutable to compare to, not null\n     * @return negative if this is less, zero if equal, positive if greater\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 39)",
        "(line 268,col 9)-(line 268,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.mutable.MutableShort.toString()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Returns the String value of this mutable.\n     * \n     * @return the mutable value as a string\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 37)"
      ]
    }
  ]
}