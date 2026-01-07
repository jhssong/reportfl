{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 37,
      "end_line": 386,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @author Apache Software Foundation\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IMAGINARY_CHARACTER"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The default imaginary character. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryCharacter"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 111,col 50)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Get the set of locales for which complex formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e \n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatComplex(org.apache.commons.math.complex.Complex)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * ComplexFormat.\n     *\n     * @param c Complex object to format\n     * @return A formatted number in the form \"Re(c) + Im(c)i\"\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 145,
      "end_line": 168,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 29)",
        "(line 149,col 9)-(line 149,col 27)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 59)",
        "(line 156,col 9)-(line 156,col 43)",
        "(line 157,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 183,
      "end_line": 201,
      "comment": "\n     * Formats a object to produce a string.  \u003ccode\u003eobj\u003c/code\u003e must be either a \n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 32)",
        "(line 189,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 56)",
        "(line 234,col 9)-(line 234,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 253,
      "end_line": 262,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @return the parsed {@link Complex} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 59)",
        "(line 255,col 9)-(line 255,col 54)",
        "(line 256,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 271,
      "end_line": 329,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 42)",
        "(line 275,col 9)-(line 275,col 46)",
        "(line 278,col 9)-(line 278,col 62)",
        "(line 279,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 288,col 49)",
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 311,col 46)",
        "(line 314,col 9)-(line 314,col 62)",
        "(line 315,col 9)-(line 320,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Parses a string to produce a object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryCharacter(java.lang.String)",
      "begin_line": 350,
      "end_line": 356,
      "comment": "\n     * Modify the imaginaryCharacter.\n     * @param imaginaryCharacter The new imaginaryCharacter value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryCharacter\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e or an empty string.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setImaginaryFormat(java.text.NumberFormat)",
      "begin_line": 364,
      "end_line": 370,
      "comment": "\n     * Modify the imaginaryFormat.\n     * @param imaginaryFormat The new imaginaryFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003eimaginaryFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.setRealFormat(java.text.NumberFormat)",
      "begin_line": 378,
      "end_line": 384,
      "comment": "\n     * Modify the realFormat.\n     * @param realFormat The new realFormat value.\n     * @throws IllegalArgumentException if \u003ccode\u003erealFormat\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 37)"
      ]
    }
  ]
}