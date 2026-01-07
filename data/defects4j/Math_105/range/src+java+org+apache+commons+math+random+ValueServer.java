{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/random/ValueServer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 367,
      "comment": "\n * Generates values for use in simulation applications.\n * \u003cp\u003e\n * How values are generated is determined by the \u003ccode\u003emode\u003c/code\u003e\n * property.\n * \u003cp\u003e\n * Supported \u003ccode\u003emode\u003c/code\u003e values are: \u003cul\u003e\n * \u003cli\u003e DIGEST_MODE -- uses an empirical distribution \u003c/li\u003e\n * \u003cli\u003e REPLAY_MODE -- replays data from \u003ccode\u003evaluesFileURL\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e UNIFORM_MODE -- generates uniformly distributed random values with\n *                      mean \u003d \u003ccode\u003emu\u003c/code\u003e \u003c/li\u003e\n * \u003cli\u003e EXPONENTIAL_MODE -- generates exponentially distributed random values\n *                         with mean \u003d \u003ccode\u003emu\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e GAUSSIAN_MODE -- generates Gaussian distributed random values with\n *                       mean \u003d \u003ccode\u003emu\u003c/code\u003e and\n *                       standard deviation \u003d \u003ccode\u003esigma\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003e CONSTANT_MODE -- returns \u003ccode\u003emu\u003c/code\u003e every time.\u003c/li\u003e\u003c/ul\u003e\n *\n * @version $Revision$ $Date$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " mode determines how values are generated "
    },
    {
      "type": "field",
      "varNames": [
        "valuesFileURL"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " URI to raw data values  "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Mean for use with non-data-driven modes "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Standard deviation for use with GAUSSIAN_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Empirical probability distribution for use with DIGEST_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "filePointer"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " file pointer for REPLAY_MODE "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " RandomDataImpl to use for random data generation "
    },
    {
      "type": "field",
      "varNames": [
        "DIGEST_MODE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Use empirical distribution  "
    },
    {
      "type": "field",
      "varNames": [
        "REPLAY_MODE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Replay data from valuesFilePath "
    },
    {
      "type": "field",
      "varNames": [
        "UNIFORM_MODE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Uniform random deviates with mean \u003d mu "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_MODE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Exponential random deviates with mean \u003d mu "
    },
    {
      "type": "field",
      "varNames": [
        "GAUSSIAN_MODE"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Gaussian random deviates with mean \u003d mu, std dev \u003d sigma "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT_MODE"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Always return mu "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer()",
      "begin_line": 88,
      "end_line": 89,
      "comment": " Creates new ValueServer ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNext()",
      "begin_line": 98,
      "end_line": 109,
      "comment": "\n     * Returns the next generated value, generated according\n     * to the mode value (see MODE constants).\n     *\n     * @return generated value\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(double[])",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Fills the input array with values generated using getNext() repeatedly.\n     *\n     * @param values array to be filled\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.fill(int)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Returns an array of length \u003ccode\u003elength\u003c/code\u003e with values generated\n     * using getNext() repeatedly.\n     *\n     * @param length length of output array\n     * @return array of generated values\n     * @throws IOException in REPLAY_MODE if a file I/O error occurs\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e, using the default number of bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DISGEST_MODE\u003c/code\u003e\n     *\n     * @throws IOException if an I/O error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 64)",
        "(line 153,col 9)-(line 153,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.computeDistribution(int)",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Computes the empirical distribution using values from the file\n     * in \u003ccode\u003evaluesFileURL\u003c/code\u003e and \u003ccode\u003ebinCount\u003c/code\u003e bins.\n     * \u003cp\u003e\n     * \u003ccode\u003evaluesFileURL\u003c/code\u003e must exist and be\n     * readable by *this at runtime.\n     * \u003cp\u003e\n     * This method must be called before using \u003ccode\u003egetNext()\u003c/code\u003e\n     * with \u003ccode\u003emode \u003d DISGEST_MODE\u003c/code\u003e\n     *\n     * @param binCount the number of bins used in computing the empirical\n     * distribution\n     * @throws IOException if an error occurs reading the input file\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 72)",
        "(line 173,col 9)-(line 173,col 50)",
        "(line 174,col 9)-(line 174,col 62)",
        "(line 175,col 9)-(line 175,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMode()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Getter for property mode.\n     * @return Value of property mode.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMode(int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": " Setter for property mode.\n     * @param mode New value of property mode.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getValuesFileURL()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Getter for \u003ccode\u003evaluesFileURL\u003ccode\u003e\n     * @return Value of property valuesFileURL.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.lang.String)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Sets the \u003ccode\u003evaluesFileURL\u003c/code\u003e using a string URL representation\n     * @param url String representation for new valuesFileURL.\n     * @throws MalformedURLException if url is not well formed\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setValuesFileURL(java.net.URL)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Sets the \u003ccode\u003evaluesFileURL\u003c/code\u003e\n     * @param url New value of property valuesFileURL.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getEmpiricalDistribution()",
      "begin_line": 220,
      "end_line": 222,
      "comment": " Getter for property empiricalDistribution.\n     * @return Value of property empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.resetReplayFile()",
      "begin_line": 229,
      "end_line": 239,
      "comment": "\n     * Resets REPLAY_MODE file pointer to the beginning of the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     *\n     * @throws IOException if an error occurs opening the file\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.closeReplayFile()",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n     * Closes \u003ccode\u003evaluesFileURL\u003c/code\u003e after use in REPLAY_MODE.\n     *\n     * @throws IOException if an error occurs closing the file\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getMu()",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Getter for property mu.\n     * @return Value of property mu.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setMu(double)",
      "begin_line": 263,
      "end_line": 265,
      "comment": " Setter for property mu.\n     * @param mu New value of property mu.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getSigma()",
      "begin_line": 270,
      "end_line": 272,
      "comment": " Getter for property sigma.\n     * @return Value of property sigma.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.setSigma(double)",
      "begin_line": 277,
      "end_line": 279,
      "comment": " Setter for property sigma.\n     * @param sigma New value of property sigma.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextDigest()",
      "begin_line": 293,
      "end_line": 299,
      "comment": "\n     * Gets a random value in DIGEST_MODE.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eBefore this method is called, \u003ccode\u003ecomputeDistribution()\u003c/code\u003e\n     * must have completed successfully; otherwise an\n     * \u003ccode\u003eIllegalStateException\u003c/code\u003e will be thrown\u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return next random value from the empirical distribution digest\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextReplay()",
      "begin_line": 315,
      "end_line": 326,
      "comment": "\n     * Gets next sequential value from the \u003ccode\u003evaluesFileURL\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws an IOException if the read fails.\n     * \u003cp\u003e\n     * This method will open the \u003ccode\u003evaluesFileURL\u003c/code\u003e if there is no\n     * replay file open.\n     * \u003cp\u003e\n     * The \u003ccode\u003evaluesFileURL\u003c/code\u003e will be closed and reopened to wrap around\n     * from EOF to BOF if EOF is encountered.\n     *\n     * @return next value from the replay file\n     * @throws IOException if there is a problem reading from the file\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 26)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextUniform()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Gets a uniformly distributed random value with mean \u003d mu.\n     *\n     * @return random uniform value\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextExponential()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Gets an exponentially distributed random value with mean \u003d mu.\n     *\n     * @return random exponential value\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServer.getNextGaussian()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Gets a Gaussian distributed random value with mean \u003d mu\n     * and standard deviation \u003d sigma.\n     *\n     * @return random Gaussian value\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServer.ValueServer(org.apache.commons.math.random.RandomData)",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\n     * Construct a ValueServer instance using a RandomData as its source\n     * of random data.\n     * \n     * @param randomData the RandomData instance used to source random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 16)",
        "(line 365,col 9)-(line 365,col 37)"
      ]
    }
  ]
}