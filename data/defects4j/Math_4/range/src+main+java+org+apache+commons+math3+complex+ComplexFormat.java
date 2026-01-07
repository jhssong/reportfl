{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 428,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @version $Id$\n "
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 62)",
        "(line 56,col 9)-(line 56,col 72)",
        "(line 57,col 9)-(line 57,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 62)",
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 83,
      "end_line": 95,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n      ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 62)",
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 94,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     * @throws NullArgumentException if {@code format} is {@code null}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 142,
      "end_line": 162,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     *\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 53)",
        "(line 160,col 9)-(line 160,col 47)",
        "(line 161,col 9)-(line 161,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Get the set of locales for which complex formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(org.apache.commons.math3.complex.Complex)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Complex object to format.\n     * @return A formatted number in the form \"Re(c) + Im(c)i\".\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(java.lang.Double)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Double object to format.\n     * @return A formatted number.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(org.apache.commons.math3.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 202,
      "end_line": 227,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 205,col 27)",
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 209,col 75)",
        "(line 212,col 9)-(line 212,col 43)",
        "(line 213,col 9)-(line 213,col 32)",
        "(line 214,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.formatImaginary(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 238,
      "end_line": 251,
      "comment": "\n     * Format the absolute value of the imaginary part.\n     *\n     * @param absIm Absolute value of the imaginary part of a complex number.\n     * @param toAppendTo where the text is to be appended.\n     * @param pos On input: an alignment field, if desired. On output: the\n     * offsets of the alignment field.\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 29)",
        "(line 242,col 9)-(line 242,col 27)",
        "(line 244,col 9)-(line 244,col 83)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 266,
      "end_line": 283,
      "comment": "\n     * Formats a object to produce a string.  {@code obj} must be either a\n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws MathIllegalArgumentException is {@code obj} is not a valid type.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 32)",
        "(line 272,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getInstance()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 72)",
        "(line 316,col 9)-(line 316,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 329,
      "end_line": 333,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @param imaginaryCharacter Imaginary character.\n     * @return the complex format specific to the given locale.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 72)",
        "(line 332,col 9)-(line 332,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getRealFormat()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse.\n     * @return the parsed {@link Complex} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 59)",
        "(line 353,col 9)-(line 353,col 54)",
        "(line 354,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 369,
      "end_line": 427,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 42)",
        "(line 373,col 9)-(line 373,col 62)",
        "(line 376,col 9)-(line 376,col 78)",
        "(line 377,col 9)-(line 382,col 9)",
        "(line 385,col 9)-(line 385,col 40)",
        "(line 386,col 9)-(line 386,col 65)",
        "(line 387,col 9)-(line 387,col 21)",
        "(line 388,col 9)-(line 406,col 9)",
        "(line 409,col 9)-(line 409,col 62)",
        "(line 412,col 9)-(line 412,col 78)",
        "(line 413,col 9)-(line 418,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 425,col 9)-(line 425,col 70)"
      ]
    }
  ]
}