{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/random/ValueServer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 370,
      "comment": "\n * Generates values for use in simulation applications.\n * \u003cp\u003e\n * How values are generated is determined by the \u003ccode\u003emode\u003c/code\u003e\n * property.\n * \u003cp\u003e\n * Supported \u003ccode\u003emode\u003c/code\u003e values are: \u003cul\u003e\n * \u003cli\u003e DIGEST_MODE -- uses an empirical distribution \u003c/li\u003e\n * \u003cli\u003e REPLAY_MODE -- replays data from \u003ccode\u003evaluesFileURL\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e UNIFORM_MODE -- generates uniformly distributed random values with\n *                      mean \u003d \u003ccode\u003emu\u003c/code\u003e \u003c/li\u003e\n * \u003cli\u003e EXPONENTIAL_MODE -- generates exponentially distributed random values\n *                         with mean \u003d \u003ccode\u003emu\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e GAUSSIAN_MODE -- generates Gaussian distributed random values with\n *                       mean \u003d \u003ccode\u003emu\u003c/code\u003e and\n *                       standard deviation \u003d \u003ccode\u003esigma\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e CONSTANT_MODE -- returns \u003ccode\u003emu\u003c/code\u003e every time.\u003c/li\u003e\u003c/ul\u003e\n *\n * @version $Revision$ $Date$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " mode determines how values are generated "
    },
    {
      "type": "field",
      "varNames": [
        "valuesFileURL"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " URI to raw data values  "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Mean for use with non-data-driven modes "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Standard deviation for use with GAUSSIAN_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Empirical probability distribution for use with DIGEST_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "filePointer"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " file pointer for REPLAY_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " RandomDataImpl to use for random data generation "
    },
    {
      "type": "field",
      "varNames": [
        "DIGEST_MODE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Use empirical distribution  "
    },
    {
      "type": "field",
      "varNames": [
        "REPLAY_MODE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Replay data from valuesFilePath "
    },
    {
      "type": "field",
      "varNames": [
        "UNIFORM_MODE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Uniform random deviates with mean \u003d mu "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_MODE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Exponential random deviates with mean \u003d mu "
    },
    {
      "type": "field",
      "varNames": [
        "GAUSSIAN_MODE"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Gaussian random deviates with mean \u003d mu, std dev \u003d sigma "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT_MODE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Always return mu "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer()",
      "begin_line": 89,
      "end_line": 90,
      "comment": " Creates new ValueServer ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNext()",
      "begin_line": 99,
      "end_line": 110,
      "comment": "\n     * Returns the next generated value, generated according\n     * to the mode value (see MODE constants).\n     *\n     * @return generated value\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(double[])",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Fills the input array with values generated using getNext() repeatedly.\n     *\n     * @param values array to be filled\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(int)",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Returns an array of length \u003ccode\u003elength\u003c/code\u003e with values generated\n     * using getNext() repeatedly.\n     *\n     * @param length length of output array\n     * @return array of generated values\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 42)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e, using the default number of bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DISGEST_MODE\u003c/code\u003e\n     *\n     * @throws IOException if an I/O error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 64)",
        "(line 154,col 9)-(line 154,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution(int)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e and \u003ccode\u003ebinCount\u003c/code\u003e bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DISGEST_MODE\u003c/code\u003e\n     *\n     * @param binCount the number of bins used in computing the empirical\n     * distribution\n     * @throws IOException if an error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 72)",
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 175,col 62)",
        "(line 176,col 9)-(line 176,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMode()",
      "begin_line": 182,
      "end_line": 184,
      "comment": " Getter for property mode.\n     * @return Value of property mode.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMode(int)",
      "begin_line": 189,
      "end_line": 191,
      "comment": " Setter for property mode.\n     * @param mode New value of property mode.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getValuesFileURL()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Getter for \u003ccode\u003evaluesFileURL\u003ccode\u003e\n     * @return Value of property valuesFileURL.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.lang.String)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Sets the \u003ccode\u003evaluesFileURL\u003c/code\u003e using a string URL representation\n     * @param url String representation for new valuesFileURL.\n     * @throws MalformedURLException if url is not well formed\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.net.URL)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Sets the \u003ccode\u003evaluesFileURL\u003c/code\u003e\n     * @param url New value of property valuesFileURL.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getEmpiricalDistribution()",
      "begin_line": 221,
      "end_line": 223,
      "comment": " Getter for property empiricalDistribution.\n     * @return Value of property empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.resetReplayFile()",
      "begin_line": 230,
      "end_line": 240,
      "comment": "\n     * Resets REPLAY_MODE file pointer to the beginning of the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     *\n     * @throws IOException if an error occurs opening the file\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.closeReplayFile()",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Closes \u003ccode\u003evaluesFileURL\u003c/code\u003e after use in REPLAY_MODE.\n     *\n     * @throws IOException if an error occurs closing the file\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMu()",
      "begin_line": 257,
      "end_line": 259,
      "comment": " Getter for property mu.\n     * @return Value of property mu.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMu(double)",
      "begin_line": 264,
      "end_line": 266,
      "comment": " Setter for property mu.\n     * @param mu New value of property mu.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getSigma()",
      "begin_line": 271,
      "end_line": 273,
      "comment": " Getter for property sigma.\n     * @return Value of property sigma.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setSigma(double)",
      "begin_line": 278,
      "end_line": 280,
      "comment": " Setter for property sigma.\n     * @param sigma New value of property sigma.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextDigest()",
      "begin_line": 294,
      "end_line": 300,
      "comment": "\n     * Gets a random value in DIGEST_MODE.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eBefore this method is called, \u003ccode\u003ecomputeDistribution()\u003c/code\u003e\n     * must have completed successfully; otherwise an\n     * \u003ccode\u003eIllegalStateException\u003c/code\u003e will be thrown\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return next random value from the empirical distribution digest\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextReplay()",
      "begin_line": 318,
      "end_line": 329,
      "comment": "\n     * Gets next sequential value from the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws an IOException if the read fails.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method will open the \u003ccode\u003evaluesFileURL\u003c/code\u003e if there is no\n     * replay file open.\u003c/p\u003e\n     * \u003cp\u003e\n     * The \u003ccode\u003evaluesFileURL\u003c/code\u003e will be closed and reopened to wrap around\n     * from EOF to BOF if EOF is encountered.\u003c/p\u003e\n     *\n     * @return next value from the replay file\n     * @throws IOException if there is a problem reading from the file\n     * @throws NumberFormatException if an invalid numeric string is\n     *   encountered in the file\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextUniform()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Gets a uniformly distributed random value with mean \u003d mu.\n     *\n     * @return random uniform value\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextExponential()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Gets an exponentially distributed random value with mean \u003d mu.\n     *\n     * @return random exponential value\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextGaussian()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Gets a Gaussian distributed random value with mean \u003d mu\n     * and standard deviation \u003d sigma.\n     *\n     * @return random Gaussian value\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer(org.apache.commons.math.random.RandomData)",
      "begin_line": 366,
      "end_line": 369,
      "comment": "\n     * Construct a ValueServer instance using a RandomData as its source\n     * of random data.\n     * \n     * @param randomData the RandomData instance used to source random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 16)",
        "(line 368,col 9)-(line 368,col 37)"
      ]
    }
  ]
}