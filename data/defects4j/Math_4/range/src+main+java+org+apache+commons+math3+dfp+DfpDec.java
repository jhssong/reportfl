{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/dfp/DfpDec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DfpDec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.dfp.Dfp"
      ],
      "begin_line": 27,
      "end_line": 369,
      "comment": " Subclass of {@link Dfp} which hides the radix-10000 artifacts of the superclass.\n * This should give outward appearances of being a decimal number with DIGITS*4-3\n * decimal digits. This class can be subclassed to appear to be an arbitrary number\n * of decimal digits less than DIGITS*4-3.\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField)",
      "begin_line": 32,
      "end_line": 34,
      "comment": " Makes an instance with a value of zero.\n     * @param factory factory linked to this instance\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField, byte)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Create an instance from a byte value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField, int)",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Create an instance from an int value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField, long)",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Create an instance from a long value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField, double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": " Create an instance from a double value.\n     * @param factory factory linked to this instance\n     * @param x value to convert to an instance\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 72,
      "end_line": 75,
      "comment": " Copy constructor.\n     * @param d instance to copy\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 17)",
        "(line 74,col 9)-(line 74,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField, java.lang.String)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " Create an instance from a String representation.\n     * @param factory factory linked to this instance\n     * @param s string representation of the instance\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 26)",
        "(line 83,col 9)-(line 83,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.DfpDec.DfpDec(org.apache.commons.math3.dfp.DfpField, byte, byte)",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Creates an instance with a non-finite value.\n     * @param factory factory linked to this instance\n     * @param sign sign of the Dfp to create\n     * @param nans code of the value, must be one of {@link #INFINITE},\n     * {@link #SNAN},  {@link #QNAN}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance()",
      "begin_line": 97,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(byte)",
      "begin_line": 103,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(int)",
      "begin_line": 109,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(long)",
      "begin_line": 115,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(double)",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 127,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(java.lang.String)",
      "begin_line": 143,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.newInstance(byte, byte)",
      "begin_line": 149,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.getDecimalDigits()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Get the number of decimal digits this class is going to represent.\n     * Default implementation returns {@link #getRadixDigits()}*4-3. Subclasses can\n     * override this to return something less.\n     * @return number of decimal digits this class is going to represent\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.round(int)",
      "begin_line": 164,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 41)",
        "(line 174,col 9)-(line 174,col 32)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 182,col 49)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 185,col 9)-(line 185,col 25)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 34)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 198,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 54)",
        "(line 215,col 9)-(line 215,col 26)",
        "(line 216,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.DfpDec.nextAfter(org.apache.commons.math3.dfp.Dfp)",
      "begin_line": 292,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 44)",
        "(line 298,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 306,col 19)",
        "(line 307,col 9)-(line 307,col 16)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 22)"
      ]
    }
  ]
}