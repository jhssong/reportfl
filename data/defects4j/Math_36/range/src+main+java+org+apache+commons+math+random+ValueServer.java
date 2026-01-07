{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/random/ValueServer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 423,
      "comment": "\n * Generates values for use in simulation applications.\n * \u003cp\u003e\n * How values are generated is determined by the \u003ccode\u003emode\u003c/code\u003e\n * property.\u003c/p\u003e\n * \u003cp\u003e\n * Supported \u003ccode\u003emode\u003c/code\u003e values are: \u003cul\u003e\n * \u003cli\u003e DIGEST_MODE -- uses an empirical distribution \u003c/li\u003e\n * \u003cli\u003e REPLAY_MODE -- replays data from \u003ccode\u003evaluesFileURL\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e UNIFORM_MODE -- generates uniformly distributed random values with\n *                      mean \u003d \u003ccode\u003emu\u003c/code\u003e \u003c/li\u003e\n * \u003cli\u003e EXPONENTIAL_MODE -- generates exponentially distributed random values\n *                         with mean \u003d \u003ccode\u003emu\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e GAUSSIAN_MODE -- generates Gaussian distributed random values with\n *                       mean \u003d \u003ccode\u003emu\u003c/code\u003e and\n *                       standard deviation \u003d \u003ccode\u003esigma\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e CONSTANT_MODE -- returns \u003ccode\u003emu\u003c/code\u003e every time.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIGEST_MODE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Use empirical distribution.  "
    },
    {
      "type": "field",
      "varNames": [
        "REPLAY_MODE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Replay data from valuesFilePath. "
    },
    {
      "type": "field",
      "varNames": [
        "UNIFORM_MODE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Uniform random deviates with mean \u003d \u0026mu;. "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_MODE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Exponential random deviates with mean \u003d \u0026mu;. "
    },
    {
      "type": "field",
      "varNames": [
        "GAUSSIAN_MODE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Gaussian random deviates with mean \u003d \u0026mu;, std dev \u003d \u0026sigma;. "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT_MODE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Always return mu "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " mode determines how values are generated. "
    },
    {
      "type": "field",
      "varNames": [
        "valuesFileURL"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " URI to raw data values. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Mean for use with non-data-driven modes. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Standard deviation for use with GAUSSIAN_MODE. "
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Empirical probability distribution for use with DIGEST_MODE. "
    },
    {
      "type": "field",
      "varNames": [
        "filePointer"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " File pointer for REPLAY_MODE. "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " RandomDataImpl to use for random data generation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Creates new ValueServer ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer(org.apache.commons.math.random.RandomDataImpl)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Construct a ValueServer instance using a RandomDataImpl as its source\n     * of random data.\n     *\n     * @param randomData the RandomDataImpl instance used to source random data\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNext()",
      "begin_line": 115,
      "end_line": 130,
      "comment": "\n     * Returns the next generated value, generated according\n     * to the mode value (see MODE constants).\n     *\n     * @return generated value\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(double[])",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\n     * Fills the input array with values generated using getNext() repeatedly.\n     *\n     * @param values array to be filled\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(int)",
      "begin_line": 152,
      "end_line": 158,
      "comment": "\n     * Returns an array of length \u003ccode\u003elength\u003c/code\u003e with values generated\n     * using getNext() repeatedly.\n     *\n     * @param length length of output array\n     * @return array of generated values\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 42)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e, using the default number of bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DIGEST_MODE\u003c/code\u003e\u003c/p\u003e\n     *\n     * @throws IOException if an I/O error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution(int)",
      "begin_line": 190,
      "end_line": 196,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e and \u003ccode\u003ebinCount\u003c/code\u003e bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be readable by this process\n     * at runtime.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DIGEST_MODE\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param binCount the number of bins used in computing the empirical\n     * distribution\n     * @throws IOException if an error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 80)",
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 194,col 62)",
        "(line 195,col 9)-(line 195,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMode()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the data generation mode. See {@link ValueServer the class javadoc}\n     * for description of the valid values of this property.\n     *\n     * @return Value of property mode.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMode(int)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Sets the data generation mode.\n     *\n     * @param mode New value of the data generation mode.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getValuesFileURL()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns the URL for the file used to build the empirical distribution\n     * when using {@link #DIGEST_MODE}.\n     *\n     * @return Values file URL.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.lang.String)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Sets the {@link #getValuesFileURL() values file URL} using a string\n     * URL representation.\n     *\n     * @param url String representation for new valuesFileURL.\n     * @throws MalformedURLException if url is not well formed\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.net.URL)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Sets the the {@link #getValuesFileURL() values file URL}.\n     *\n     * @param url URL of the values file.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getEmpiricalDistribution()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns the {@link EmpiricalDistribution} used when operating in {@value #DIGEST_MODE}.\n     *\n     * @return EmpircalDistribution built by {@link #computeDistribution()}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.resetReplayFile()",
      "begin_line": 261,
      "end_line": 271,
      "comment": "\n     * Resets REPLAY_MODE file pointer to the beginning of the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     *\n     * @throws IOException if an error occurs opening the file\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.closeReplayFile()",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * Closes {@code valuesFileURL} after use in REPLAY_MODE.\n     *\n     * @throws IOException if an error occurs closing the file\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMu()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Returns the mean used when operating in {@link #GAUSSIAN_MODE}, {@link #EXPONENTIAL_MODE}\n     * or {@link #UNIFORM_MODE}.  When operating in {@link #CONSTANT_MODE}, this is the constant\n     * value always returned.  Calling {@link #computeDistribution()} sets this value to the\n     * overall mean of the values in the {@link #getValuesFileURL() values file}.\n     *\n     * @return Mean used in data generation.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMu(double)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Sets the {@link #getMu() mean} used in data generation.  Note that calling this method\n     * after {@link #computeDistribution()} has been called will have no effect on data\n     * generated in {@link #DIGEST_MODE}.\n     *\n     * @param mu new Mean value.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getSigma()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Returns the standard deviation used when operating in {@link #GAUSSIAN_MODE}.\n     * Calling {@link #computeDistribution()} sets this value to the overall standard\n     * deviation of the values in the {@link #getValuesFileURL() values file}.  This\n     * property has no effect when the data generation mode is not\n     * {@link #GAUSSIAN_MODE}.\n     *\n     * @return Standard deviation used when operating in {@link #GAUSSIAN_MODE}.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setSigma(double)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Sets the {@link #getSigma() standard deviation} used in {@link #GAUSSIAN_MODE}.\n     *\n     * @param sigma New standard deviation.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.reSeed(long)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Reseeds the random data generator.\n     *\n     * @param seed Value with which to reseed the {@link RandomDataImpl}\n     * used to generate random data.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextDigest()",
      "begin_line": 352,
      "end_line": 358,
      "comment": "\n     * Gets a random value in DIGEST_MODE.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eBefore this method is called, \u003ccode\u003ecomputeDistribution()\u003c/code\u003e\n     * must have completed successfully; otherwise an\n     * \u003ccode\u003eIllegalStateException\u003c/code\u003e will be thrown\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return next random value from the empirical distribution digest\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextReplay()",
      "begin_line": 378,
      "end_line": 393,
      "comment": "\n     * Gets next sequential value from the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws an IOException if the read fails.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method will open the \u003ccode\u003evaluesFileURL\u003c/code\u003e if there is no\n     * replay file open.\u003c/p\u003e\n     * \u003cp\u003e\n     * The \u003ccode\u003evaluesFileURL\u003c/code\u003e will be closed and reopened to wrap around\n     * from EOF to BOF if EOF is encountered. EOFException (which is a kind of\n     * IOException) may still be thrown if the \u003ccode\u003evaluesFileURL\u003c/code\u003e is\n     * empty.\u003c/p\u003e\n     *\n     * @return next value from the replay file\n     * @throws IOException if there is a problem reading from the file\n     * @throws NumberFormatException if an invalid numeric string is\n     *   encountered in the file\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextUniform()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Gets a uniformly distributed random value with mean \u003d mu.\n     *\n     * @return random uniform value\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextExponential()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * Gets an exponentially distributed random value with mean \u003d mu.\n     *\n     * @return random exponential value\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextGaussian()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Gets a Gaussian distributed random value with mean \u003d mu\n     * and standard deviation \u003d sigma.\n     *\n     * @return random Gaussian value\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 50)"
      ]
    }
  ]
}