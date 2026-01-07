{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/MersenneTwister.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MersenneTwister",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.BitsStreamGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 265,
      "comment": " This class implements a powerful pseudo-random number generator\n * developed by Makoto Matsumoto and Takuji Nishimura during\n * 1996-1997.\n\n * \u003cp\u003eThis generator features an extremely long period\n * (2\u003csup\u003e19937\u003c/sup\u003e-1) and 623-dimensional equidistribution up to 32\n * bits accuracy. The home page for this generator is located at \u003ca\n * href\u003d\"http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/emt.html\"\u003e\n * http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/emt.html\u003c/a\u003e.\u003c/p\u003e\n\n * \u003cp\u003eThis generator is described in a paper by Makoto Matsumoto and\n * Takuji Nishimura in 1998: \u003ca\n * href\u003d\"http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/ARTICLES/mt.pdf\"\u003eMersenne\n * Twister: A 623-Dimensionally Equidistributed Uniform Pseudo-Random\n * Number Generator\u003c/a\u003e, ACM Transactions on Modeling and Computer\n * Simulation, Vol. 8, No. 1, January 1998, pp 3--30\u003c/p\u003e\n\n * \u003cp\u003eThis class is mainly a Java port of the 2002-01-26 version of\n * the generator written in C by Makoto Matsumoto and Takuji\n * Nishimura. Here is their original copyright:\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003eCopyright (C) 1997 - 2002, Makoto Matsumoto and Takuji Nishimura,\n *     All rights reserved.\u003c/td\u003e\u003c/tr\u003e\n\n * \u003ctr\u003e\u003ctd\u003eRedistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *   \u003cli\u003eRedistributions of source code must retain the above copyright\n *       notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n *   \u003cli\u003eRedistributions in binary form must reproduce the above copyright\n *       notice, this list of conditions and the following disclaimer in the\n *       documentation and/or other materials provided with the distribution.\u003c/li\u003e\n *   \u003cli\u003eThe names of its contributors may not be used to endorse or promote\n *       products derived from this software without specific prior written\n *       permission.\u003c/li\u003e\n * \u003c/ol\u003e\u003c/td\u003e\u003c/tr\u003e\n\n * \u003ctr\u003e\u003ctd\u003e\u003cstrong\u003eTHIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND\n * CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES,\n * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF\n * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE\n * DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS\n * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,\n * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,\n * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR\n * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY\n * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT\n * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE\n * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH\n * DAMAGE.\u003c/strong\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @version $Id$\n * @since 2.0\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Size of the bytes pool. "
    },
    {
      "type": "field",
      "varNames": [
        "M"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Period second parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "MAG01"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " X * MATRIX_A for X \u003d {0, 1}. "
    },
    {
      "type": "field",
      "varNames": [
        "mt"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Bytes pool. "
    },
    {
      "type": "field",
      "varNames": [
        "mti"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Current index in the bytes pool. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.MersenneTwister.MersenneTwister()",
      "begin_line": 106,
      "end_line": 109,
      "comment": " Creates a new random number generator.\n     * \u003cp\u003eThe instance is initialized using the current time plus the\n     * system identity hash code of this instance as the seed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 24)",
        "(line 108,col 9)-(line 108,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.MersenneTwister.MersenneTwister(int)",
      "begin_line": 114,
      "end_line": 117,
      "comment": " Creates a new random number generator using a single int seed.\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 24)",
        "(line 116,col 9)-(line 116,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.MersenneTwister.MersenneTwister(int[])",
      "begin_line": 123,
      "end_line": 126,
      "comment": " Creates a new random number generator using an int array seed.\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)",
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.MersenneTwister.MersenneTwister(long)",
      "begin_line": 131,
      "end_line": 134,
      "comment": " Creates a new random number generator using a single long seed.\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 133,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.MersenneTwister.setSeed(int)",
      "begin_line": 141,
      "end_line": 155,
      "comment": " Reinitialize the generator as if just built with the given int seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 27)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.MersenneTwister.setSeed(int[])",
      "begin_line": 164,
      "end_line": 207,
      "comment": " Reinitialize the generator as if just built with the given int array seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be the current system time plus the\n     * system identity hash code of this instance\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 26)",
        "(line 173,col 9)-(line 173,col 18)",
        "(line 174,col 9)-(line 174,col 18)",
        "(line 176,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 27)",
        "(line 205,col 9)-(line 205,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.MersenneTwister.setSeed(long)",
      "begin_line": 214,
      "end_line": 217,
      "comment": " Reinitialize the generator as if just built with the given long seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.MersenneTwister.next(int)",
      "begin_line": 228,
      "end_line": 263,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 14)",
        "(line 233,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 22)",
        "(line 256,col 9)-(line 256,col 23)",
        "(line 257,col 9)-(line 257,col 37)",
        "(line 258,col 9)-(line 258,col 37)",
        "(line 259,col 9)-(line 259,col 23)",
        "(line 261,col 9)-(line 261,col 33)"
      ]
    }
  ]
}