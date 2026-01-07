{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/SobolSequenceGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SobolSequenceGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomVectorGenerator"
      ],
      "begin_line": 57,
      "end_line": 326,
      "comment": "\n * Implementation of a Sobol sequence.\n * \u003cp\u003e\n * A Sobol sequence is a low-discrepancy sequence with the property that for all values of N,\n * its subsequence (x1, ... xN) has a low discrepancy. It can be used to generate pseudo-random\n * points in a space S, which are equi-distributed.\n * \u003cp\u003e\n * The implementation already comes with support for up to 1000 dimensions with direction numbers\n * calculated from \u003ca href\u003d\"http://web.maths.unsw.edu.au/~fkuo/sobol/\"\u003eStephen Joe and Frances Kuo\u003c/a\u003e.\n * \u003cp\u003e\n * The generator supports two modes:\n * \u003cul\u003e\n *   \u003cli\u003esequential generation of points: {@link #nextVector()}\u003c/li\u003e\n *   \u003cli\u003erandom access to the i-th point in the sequence: {@link #skipTo(int)}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Sobol_sequence\"\u003eSobol sequence (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://web.maths.unsw.edu.au/~fkuo/sobol/\"\u003eSobol sequence direction numbers\u003c/a\u003e\n *\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BITS"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The number of bits to use. "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The scaling factor. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_DIMENSION"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The maximum supported space dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "RESOURCE_NAME"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The resource containing the direction numbers. "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_CHARSET"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Character set for file input. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Space dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The current index in the sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The direction vector for each component. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The current state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.SobolSequenceGenerator(int)",
      "begin_line": 92,
      "end_line": 124,
      "comment": "\n     * Construct a new Sobol sequence generator for the given space dimension.\n     *\n     * @param dimension the space dimension\n     * @throws OutOfRangeException if the space dimension is outside the allowed range of [1, 1000]\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 98,col 9)-(line 98,col 77)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 35)",
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 107,col 32)",
        "(line 109,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.SobolSequenceGenerator(int, java.io.InputStream)",
      "begin_line": 157,
      "end_line": 175,
      "comment": "\n     * Construct a new Sobol sequence generator for the given space dimension with\n     * direction vectors loaded from the given stream.\n     * \u003cp\u003e\n     * The expected format is identical to the files available from\n     * \u003ca href\u003d\"http://web.maths.unsw.edu.au/~fkuo/sobol/\"\u003eStephen Joe and Frances Kuo\u003c/a\u003e.\n     * The first line will be ignored as it is assumed to contain only the column headers.\n     * The columns are:\n     * \u003cul\u003e\n     *  \u003cli\u003ed: the dimension\u003c/li\u003e\n     *  \u003cli\u003es: the degree of the primitive polynomial\u003c/li\u003e\n     *  \u003cli\u003ea: the number representing the coefficients\u003c/li\u003e\n     *  \u003cli\u003em: the list of initial direction numbers\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Example:\n     * \u003cpre\u003e\n     * d       s       a       m_i\n     * 2       1       0       1\n     * 3       2       1       1 3\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The input stream \u003ci\u003emust\u003c/i\u003e be an ASCII text containing one valid direction vector per line.\n     *\n     * @param dimension the space dimension\n     * @param is the stream to read the direction vectors from\n     * @throws NotStrictlyPositiveException if the space dimension is \u0026lt; 1\n     * @throws OutOfRangeException if the space dimension is outside the range [1, max], where\n     *   max refers to the maximum dimension found in the input stream\n     * @throws MathParseException if the content in the stream could not be parsed successfully\n     * @throws IOException if an error occurs while reading from the input stream\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 168,col 32)",
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.initFromStream(java.io.InputStream)",
      "begin_line": 188,
      "end_line": 235,
      "comment": "\n     * Load the direction vector for each dimension from the given stream.\n     * \u003cp\u003e\n     * The input stream \u003ci\u003emust\u003c/i\u003e be an ASCII text containing one\n     * valid direction vector per line.\n     *\n     * @param is the input stream to read the direction vector from\n     * @return the last dimension that has been read from the input stream\n     * @throws IOException if the stream could not be read\n     * @throws MathParseException if the content could not be parsed successfully\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 62)",
        "(line 196,col 9)-(line 196,col 93)",
        "(line 197,col 9)-(line 197,col 21)",
        "(line 199,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.initDirectionVector(int, int, int[])",
      "begin_line": 244,
      "end_line": 255,
      "comment": "\n     * Calculate the direction numbers from the given polynomial.\n     *\n     * @param d the dimension, zero-based\n     * @param a the coefficients of the primitive polynomial\n     * @param m the initial direction numbers\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.nextVector()",
      "begin_line": 258,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 263,col 9)",
        "(line 266,col 9)-(line 266,col 18)",
        "(line 267,col 9)-(line 267,col 30)",
        "(line 268,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 16)",
        "(line 278,col 9)-(line 278,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.skipTo(int)",
      "begin_line": 290,
      "end_line": 314,
      "comment": "\n     * Skip to the i-th point in the Sobol sequence.\n     * \u003cp\u003e\n     * This operation can be performed in O(1).\n     *\n     * @param index the index in the sequence to skip to\n     * @return the i-th point in the Sobol sequence\n     * @throws NotPositiveException if index \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 22)",
        "(line 313,col 9)-(line 313,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SobolSequenceGenerator.getNextIndex()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Returns the index i of the next point in the Sobol sequence that will be returned\n     * by calling {@link #nextVector()}.\n     *\n     * @return the index of the next point\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 21)"
      ]
    }
  ]
}