{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/ValueServer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 457,
      "comment": "\n * Generates values for use in simulation applications.\n * \u003cp\u003e\n * How values are generated is determined by the \u003ccode\u003emode\u003c/code\u003e\n * property.\u003c/p\u003e\n * \u003cp\u003e\n * Supported \u003ccode\u003emode\u003c/code\u003e values are: \u003cul\u003e\n * \u003cli\u003e DIGEST_MODE -- uses an empirical distribution \u003c/li\u003e\n * \u003cli\u003e REPLAY_MODE -- replays data from \u003ccode\u003evaluesFileURL\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e UNIFORM_MODE -- generates uniformly distributed random values with\n *                      mean \u003d \u003ccode\u003emu\u003c/code\u003e \u003c/li\u003e\n * \u003cli\u003e EXPONENTIAL_MODE -- generates exponentially distributed random values\n *                         with mean \u003d \u003ccode\u003emu\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e GAUSSIAN_MODE -- generates Gaussian distributed random values with\n *                       mean \u003d \u003ccode\u003emu\u003c/code\u003e and\n *                       standard deviation \u003d \u003ccode\u003esigma\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e CONSTANT_MODE -- returns \u003ccode\u003emu\u003c/code\u003e every time.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIGEST_MODE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Use empirical distribution.  "
    },
    {
      "type": "field",
      "varNames": [
        "REPLAY_MODE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Replay data from valuesFilePath. "
    },
    {
      "type": "field",
      "varNames": [
        "UNIFORM_MODE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Uniform random deviates with mean \u003d \u0026mu;. "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_MODE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Exponential random deviates with mean \u003d \u0026mu;. "
    },
    {
      "type": "field",
      "varNames": [
        "GAUSSIAN_MODE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Gaussian random deviates with mean \u003d \u0026mu;, std dev \u003d \u0026sigma;. "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT_MODE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Always return mu "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " mode determines how values are generated. "
    },
    {
      "type": "field",
      "varNames": [
        "valuesFileURL"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " URI to raw data values. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Mean for use with non-data-driven modes. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Standard deviation for use with GAUSSIAN_MODE. "
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Empirical probability distribution for use with DIGEST_MODE. "
    },
    {
      "type": "field",
      "varNames": [
        "filePointer"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " File pointer for REPLAY_MODE. "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " RandomDataImpl to use for random data generation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.ValueServer.ValueServer()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " Creates new ValueServer ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.ValueServer.ValueServer(org.apache.commons.math3.random.RandomDataImpl)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Construct a ValueServer instance using a RandomDataImpl as its source\n     * of random data.\n     *\n     * @param randomData the RandomDataImpl instance used to source random data\n     * @since 3.0\n     * @deprecated use {@link #ValueServer(RandomGenerator)}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.ValueServer.ValueServer(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Construct a ValueServer instance using a RandomGenerator as its source\n     * of random data.\n     *\n     * @since 3.1\n     * @param generator source of random data\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getNext()",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n     * Returns the next generated value, generated according\n     * to the mode value (see MODE constants).\n     *\n     * @return generated value\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     * @throws MathIllegalStateException if mode is not recognized\n     * @throws MathIllegalArgumentException if the underlying random generator thwrows one\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.fill(double[])",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * Fills the input array with values generated using getNext() repeatedly.\n     *\n     * @param values array to be filled\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     * @throws MathIllegalStateException if mode is not recognized\n     * @throws MathIllegalArgumentException if the underlying random generator thwrows one\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.fill(int)",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * Returns an array of length \u003ccode\u003elength\u003c/code\u003e with values generated\n     * using getNext() repeatedly.\n     *\n     * @param length length of output array\n     * @return array of generated values\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     * @throws MathIllegalStateException if mode is not recognized\n     * @throws MathIllegalArgumentException if the underlying random generator thwrows one\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 42)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.computeDistribution()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e, using the default number of bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DIGEST_MODE\u003c/code\u003e\u003c/p\u003e\n     *\n     * @throws IOException if an I/O error occurs reading the input file\n     * @throws NullArgumentException if the {@code valuesFileURL} has not been set\n     * @throws ZeroException if URL contains no data\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.computeDistribution(int)",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e and \u003ccode\u003ebinCount\u003c/code\u003e bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be readable by this process\n     * at runtime.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DIGEST_MODE\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param binCount the number of bins used in computing the empirical\n     * distribution\n     * @throws NullArgumentException if the {@code valuesFileURL} has not been set\n     * @throws IOException if an error occurs reading the input file\n     * @throws ZeroException if URL contains no data\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 80)",
        "(line 219,col 9)-(line 219,col 50)",
        "(line 220,col 9)-(line 220,col 62)",
        "(line 221,col 9)-(line 221,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getMode()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns the data generation mode. See {@link ValueServer the class javadoc}\n     * for description of the valid values of this property.\n     *\n     * @return Value of property mode.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.setMode(int)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Sets the data generation mode.\n     *\n     * @param mode New value of the data generation mode.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getValuesFileURL()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns the URL for the file used to build the empirical distribution\n     * when using {@link #DIGEST_MODE}.\n     *\n     * @return Values file URL.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.setValuesFileURL(java.lang.String)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Sets the {@link #getValuesFileURL() values file URL} using a string\n     * URL representation.\n     *\n     * @param url String representation for new valuesFileURL.\n     * @throws MalformedURLException if url is not well formed\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.setValuesFileURL(java.net.URL)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Sets the the {@link #getValuesFileURL() values file URL}.\n     *\n     * \u003cp\u003eThe values file \u003ci\u003emust\u003c/i\u003e be an ASCII text file containing one\n     * valid numeric entry per line.\u003c/p\u003e\n     *\n     * @param url URL of the values file.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getEmpiricalDistribution()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Returns the {@link EmpiricalDistribution} used when operating in {@value #DIGEST_MODE}.\n     *\n     * @return EmpircalDistribution built by {@link #computeDistribution()}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.resetReplayFile()",
      "begin_line": 290,
      "end_line": 300,
      "comment": "\n     * Resets REPLAY_MODE file pointer to the beginning of the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     *\n     * @throws IOException if an error occurs opening the file\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.closeReplayFile()",
      "begin_line": 307,
      "end_line": 312,
      "comment": "\n     * Closes {@code valuesFileURL} after use in REPLAY_MODE.\n     *\n     * @throws IOException if an error occurs closing the file\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getMu()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Returns the mean used when operating in {@link #GAUSSIAN_MODE}, {@link #EXPONENTIAL_MODE}\n     * or {@link #UNIFORM_MODE}.  When operating in {@link #CONSTANT_MODE}, this is the constant\n     * value always returned.  Calling {@link #computeDistribution()} sets this value to the\n     * overall mean of the values in the {@link #getValuesFileURL() values file}.\n     *\n     * @return Mean used in data generation.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.setMu(double)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Sets the {@link #getMu() mean} used in data generation.  Note that calling this method\n     * after {@link #computeDistribution()} has been called will have no effect on data\n     * generated in {@link #DIGEST_MODE}.\n     *\n     * @param mu new Mean value.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getSigma()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Returns the standard deviation used when operating in {@link #GAUSSIAN_MODE}.\n     * Calling {@link #computeDistribution()} sets this value to the overall standard\n     * deviation of the values in the {@link #getValuesFileURL() values file}.  This\n     * property has no effect when the data generation mode is not\n     * {@link #GAUSSIAN_MODE}.\n     *\n     * @return Standard deviation used when operating in {@link #GAUSSIAN_MODE}.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.setSigma(double)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Sets the {@link #getSigma() standard deviation} used in {@link #GAUSSIAN_MODE}.\n     *\n     * @param sigma New standard deviation.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.reSeed(long)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Reseeds the random data generator.\n     *\n     * @param seed Value with which to reseed the {@link RandomDataImpl}\n     * used to generate random data.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getNextDigest()",
      "begin_line": 382,
      "end_line": 388,
      "comment": "\n     * Gets a random value in DIGEST_MODE.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eBefore this method is called, \u003ccode\u003ecomputeDistribution()\u003c/code\u003e\n     * must have completed successfully; otherwise an\n     * \u003ccode\u003eIllegalStateException\u003c/code\u003e will be thrown\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return next random value from the empirical distribution digest\n     * @throws MathIllegalStateException if digest has not been initialized\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getNextReplay()",
      "begin_line": 409,
      "end_line": 424,
      "comment": "\n     * Gets next sequential value from the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws an IOException if the read fails.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method will open the \u003ccode\u003evaluesFileURL\u003c/code\u003e if there is no\n     * replay file open.\u003c/p\u003e\n     * \u003cp\u003e\n     * The \u003ccode\u003evaluesFileURL\u003c/code\u003e will be closed and reopened to wrap around\n     * from EOF to BOF if EOF is encountered. EOFException (which is a kind of\n     * IOException) may still be thrown if the \u003ccode\u003evaluesFileURL\u003c/code\u003e is\n     * empty.\u003c/p\u003e\n     *\n     * @return next value from the replay file\n     * @throws IOException if there is a problem reading from the file\n     * @throws MathIllegalStateException if URL contains no data\n     * @throws NumberFormatException if an invalid numeric string is\n     *   encountered in the file\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 26)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getNextUniform()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Gets a uniformly distributed random value with mean \u003d mu.\n     *\n     * @return random uniform value\n     * @throws MathIllegalArgumentException if the underlying random generator thwrows one\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getNextExponential()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * Gets an exponentially distributed random value with mean \u003d mu.\n     *\n     * @return random exponential value\n     * @throws MathIllegalArgumentException if the underlying random generator thwrows one\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ValueServer.getNextGaussian()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Gets a Gaussian distributed random value with mean \u003d mu\n     * and standard deviation \u003d sigma.\n     *\n     * @return random Gaussian value\n     * @throws MathIllegalArgumentException if the underlying random generator thwrows one\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 50)"
      ]
    }
  ]
}