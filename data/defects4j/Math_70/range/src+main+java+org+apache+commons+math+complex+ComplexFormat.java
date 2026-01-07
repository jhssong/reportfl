{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 36,
      "end_line": 385,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IMAGINARY_CHARACTER"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The default imaginary character. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryCharacter"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 110,col 9)-(line 110,col 50)",
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Get the set of locales for which complex formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatComplex(org.apache.commons.math.complex.Complex)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * ComplexFormat.\n     *\n     * @param c Complex object to format\n     * @return A formatted number in the form \"Re(c) + Im(c)i\"\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 144,
      "end_line": 167,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 29)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 152,col 59)",
        "(line 155,col 9)-(line 155,col 43)",
        "(line 156,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 182,
      "end_line": 200,
      "comment": "\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a\n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 32)",
        "(line 188,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 56)",
        "(line 233,col 9)-(line 233,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 252,
      "end_line": 261,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @return the parsed {@link Complex} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 59)",
        "(line 254,col 9)-(line 254,col 54)",
        "(line 255,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 270,
      "end_line": 328,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 42)",
        "(line 274,col 9)-(line 274,col 46)",
        "(line 277,col 9)-(line 277,col 62)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 49)",
        "(line 288,col 9)-(line 288,col 21)",
        "(line 289,col 9)-(line 307,col 9)",
        "(line 310,col 9)-(line 310,col 46)",
        "(line 313,col 9)-(line 313,col 62)",
        "(line 314,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Parses a string to produce a object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryCharacter(java.lang.String)",
      "begin_line": 349,
      "end_line": 355,
      "comment": "\n     * Modify the imaginaryCharacter.\n     * @param imaginaryCharacter The new imaginaryCharacter value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryCharacter\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e or an empty string.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryFormat(java.text.NumberFormat)",
      "begin_line": 363,
      "end_line": 369,
      "comment": "\n     * Modify the imaginaryFormat.\n     * @param imaginaryFormat The new imaginaryFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setRealFormat(java.text.NumberFormat)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\n     * Modify the realFormat.\n     * @param realFormat The new realFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003erealFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 37)"
      ]
    }
  ]
}