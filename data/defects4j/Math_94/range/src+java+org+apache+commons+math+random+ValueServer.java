{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/random/ValueServer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 388,
      "comment": "\n * Generates values for use in simulation applications.\n * \u003cp\u003e\n * How values are generated is determined by the \u003ccode\u003emode\u003c/code\u003e\n * property.\u003c/p\u003e\n * \u003cp\u003e\n * Supported \u003ccode\u003emode\u003c/code\u003e values are: \u003cul\u003e\n * \u003cli\u003e DIGEST_MODE -- uses an empirical distribution \u003c/li\u003e\n * \u003cli\u003e REPLAY_MODE -- replays data from \u003ccode\u003evaluesFileURL\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e UNIFORM_MODE -- generates uniformly distributed random values with\n *                      mean \u003d \u003ccode\u003emu\u003c/code\u003e \u003c/li\u003e\n * \u003cli\u003e EXPONENTIAL_MODE -- generates exponentially distributed random values\n *                         with mean \u003d \u003ccode\u003emu\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e GAUSSIAN_MODE -- generates Gaussian distributed random values with\n *                       mean \u003d \u003ccode\u003emu\u003c/code\u003e and\n *                       standard deviation \u003d \u003ccode\u003esigma\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e CONSTANT_MODE -- returns \u003ccode\u003emu\u003c/code\u003e every time.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " mode determines how values are generated "
    },
    {
      "type": "field",
      "varNames": [
        "valuesFileURL"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " URI to raw data values  "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Mean for use with non-data-driven modes "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Standard deviation for use with GAUSSIAN_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Empirical probability distribution for use with DIGEST_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "filePointer"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " file pointer for REPLAY_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " RandomDataImpl to use for random data generation "
    },
    {
      "type": "field",
      "varNames": [
        "DIGEST_MODE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Use empirical distribution  "
    },
    {
      "type": "field",
      "varNames": [
        "REPLAY_MODE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Replay data from valuesFilePath "
    },
    {
      "type": "field",
      "varNames": [
        "UNIFORM_MODE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Uniform random deviates with mean \u003d mu "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_MODE"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Exponential random deviates with mean \u003d mu "
    },
    {
      "type": "field",
      "varNames": [
        "GAUSSIAN_MODE"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Gaussian random deviates with mean \u003d mu, std dev \u003d sigma "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT_MODE"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Always return mu "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer()",
      "begin_line": 91,
      "end_line": 92,
      "comment": " Creates new ValueServer ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNext()",
      "begin_line": 101,
      "end_line": 122,
      "comment": "\n     * Returns the next generated value, generated according\n     * to the mode value (see MODE constants).\n     *\n     * @return generated value\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(double[])",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\n     * Fills the input array with values generated using getNext() repeatedly.\n     *\n     * @param values array to be filled\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(int)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * Returns an array of length \u003ccode\u003elength\u003c/code\u003e with values generated\n     * using getNext() repeatedly.\n     *\n     * @param length length of output array\n     * @return array of generated values\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 42)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e, using the default number of bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DIGEST_MODE\u003c/code\u003e\u003c/p\u003e\n     *\n     * @throws IOException if an I/O error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 64)",
        "(line 166,col 9)-(line 166,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution(int)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e and \u003ccode\u003ebinCount\u003c/code\u003e bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be readable by this process\n     * at runtime.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DIGEST_MODE\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param binCount the number of bins used in computing the empirical\n     * distribution\n     * @throws IOException if an error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 72)",
        "(line 186,col 9)-(line 186,col 50)",
        "(line 187,col 9)-(line 187,col 62)",
        "(line 188,col 9)-(line 188,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMode()",
      "begin_line": 194,
      "end_line": 196,
      "comment": " Getter for property mode.\n     * @return Value of property mode.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMode(int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Setter for property mode.\n     * @param mode New value of property mode.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getValuesFileURL()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Getter for \u003ccode\u003evaluesFileURL\u003ccode\u003e\n     * @return Value of property valuesFileURL.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.lang.String)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Sets the \u003ccode\u003evaluesFileURL\u003c/code\u003e using a string URL representation\n     * @param url String representation for new valuesFileURL.\n     * @throws MalformedURLException if url is not well formed\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.net.URL)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Sets the \u003ccode\u003evaluesFileURL\u003c/code\u003e\n     * @param url New value of property valuesFileURL.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getEmpiricalDistribution()",
      "begin_line": 233,
      "end_line": 235,
      "comment": " Getter for property empiricalDistribution.\n     * @return Value of property empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.resetReplayFile()",
      "begin_line": 242,
      "end_line": 252,
      "comment": "\n     * Resets REPLAY_MODE file pointer to the beginning of the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     *\n     * @throws IOException if an error occurs opening the file\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.closeReplayFile()",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\n     * Closes \u003ccode\u003evaluesFileURL\u003c/code\u003e after use in REPLAY_MODE.\n     *\n     * @throws IOException if an error occurs closing the file\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMu()",
      "begin_line": 269,
      "end_line": 271,
      "comment": " Getter for property mu.\n     * @return Value of property mu.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMu(double)",
      "begin_line": 276,
      "end_line": 278,
      "comment": " Setter for property mu.\n     * @param mu New value of property mu.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getSigma()",
      "begin_line": 283,
      "end_line": 285,
      "comment": " Getter for property sigma.\n     * @return Value of property sigma.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setSigma(double)",
      "begin_line": 290,
      "end_line": 292,
      "comment": " Setter for property sigma.\n     * @param sigma New value of property sigma.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextDigest()",
      "begin_line": 306,
      "end_line": 312,
      "comment": "\n     * Gets a random value in DIGEST_MODE.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eBefore this method is called, \u003ccode\u003ecomputeDistribution()\u003c/code\u003e\n     * must have completed successfully; otherwise an\n     * \u003ccode\u003eIllegalStateException\u003c/code\u003e will be thrown\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return next random value from the empirical distribution digest\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextReplay()",
      "begin_line": 332,
      "end_line": 347,
      "comment": "\n     * Gets next sequential value from the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws an IOException if the read fails.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method will open the \u003ccode\u003evaluesFileURL\u003c/code\u003e if there is no\n     * replay file open.\u003c/p\u003e\n     * \u003cp\u003e\n     * The \u003ccode\u003evaluesFileURL\u003c/code\u003e will be closed and reopened to wrap around\n     * from EOF to BOF if EOF is encountered. EOFException (which is a kind of\n     * IOException) may still be thrown if the \u003ccode\u003evaluesFileURL\u003c/code\u003e is\n     * empty.\u003c/p\u003e\n     *\n     * @return next value from the replay file\n     * @throws IOException if there is a problem reading from the file\n     * @throws NumberFormatException if an invalid numeric string is\n     *   encountered in the file\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 26)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextUniform()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Gets a uniformly distributed random value with mean \u003d mu.\n     *\n     * @return random uniform value\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextExponential()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Gets an exponentially distributed random value with mean \u003d mu.\n     *\n     * @return random exponential value\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextGaussian()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Gets a Gaussian distributed random value with mean \u003d mu\n     * and standard deviation \u003d sigma.\n     *\n     * @return random Gaussian value\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer(org.apache.commons.math.random.RandomData)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n     * Construct a ValueServer instance using a RandomData as its source\n     * of random data.\n     * \n     * @param randomData the RandomData instance used to source random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 16)",
        "(line 386,col 9)-(line 386,col 37)"
      ]
    }
  ]
}