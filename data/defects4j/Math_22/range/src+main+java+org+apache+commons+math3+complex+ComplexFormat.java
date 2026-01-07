{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 439,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @version $Id$\n "
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
      "begin_line": 45,
      "end_line": 45,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 62)",
        "(line 57,col 9)-(line 57,col 72)",
        "(line 58,col 9)-(line 58,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 67,
      "end_line": 74,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 62)",
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 84,
      "end_line": 96,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n      ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 62)",
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 95,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     * @throws NullArgumentException if {@code format} is {@code null}.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 143,
      "end_line": 163,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     *\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 47)",
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Get the set of locales for which complex formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(org.apache.commons.math3.complex.Complex)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Complex object to format.\n     * @return A formatted number in the form \"Re(c) + Im(c)i\".\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(java.lang.Double)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Double object to format.\n     * @return A formatted number.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(org.apache.commons.math3.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 203,
      "end_line": 228,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 29)",
        "(line 206,col 9)-(line 206,col 27)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 75)",
        "(line 213,col 9)-(line 213,col 43)",
        "(line 214,col 9)-(line 214,col 32)",
        "(line 215,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.formatImaginary(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 240,
      "end_line": 257,
      "comment": "\n     * Format the absolute value of the imaginary part.\n     *\n     * @param absIm Absolute value of the imaginary part of a complex number.\n     * @param toAppendTo where the text is to be appended.\n     * @param pos On input: an alignment field, if desired. On output: the\n     * offsets of the alignment field.\n     * @return the value passed in as toAppendTo.\n     * @throws MathInternalError if {@code absIm} is not positive.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 29)",
        "(line 248,col 9)-(line 248,col 27)",
        "(line 250,col 9)-(line 250,col 83)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 272,
      "end_line": 289,
      "comment": "\n     * Formats a object to produce a string.  {@code obj} must be either a\n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws MathIllegalArgumentException is {@code obj} is not a valid type.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 32)",
        "(line 278,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getInstance()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 320,
      "end_line": 328,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 340,
      "end_line": 344,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @param imaginaryCharacter Imaginary character.\n     * @return the complex format specific to the given locale.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 72)",
        "(line 343,col 9)-(line 343,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.getRealFormat()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 362,
      "end_line": 371,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse.\n     * @return the parsed {@link Complex} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 59)",
        "(line 364,col 9)-(line 364,col 54)",
        "(line 365,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 380,
      "end_line": 438,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 42)",
        "(line 384,col 9)-(line 384,col 62)",
        "(line 387,col 9)-(line 387,col 78)",
        "(line 388,col 9)-(line 393,col 9)",
        "(line 396,col 9)-(line 396,col 40)",
        "(line 397,col 9)-(line 397,col 65)",
        "(line 398,col 9)-(line 398,col 21)",
        "(line 399,col 9)-(line 417,col 9)",
        "(line 420,col 9)-(line 420,col 62)",
        "(line 423,col 9)-(line 423,col 78)",
        "(line 424,col 9)-(line 429,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 70)"
      ]
    }
  ]
}