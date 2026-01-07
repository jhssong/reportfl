{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/MersenneTwister.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MersenneTwister",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.BitsStreamGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 80,
      "end_line": 257,
      "comment": " This class implements a powerful pseudo-random number generator\n * developed by Makoto Matsumoto and Takuji Nishimura during\n * 1996-1997.\n\n * \u003cp\u003eThis generator features an extremely long period\n * (2\u003csup\u003e19937\u003c/sup\u003e-1) and 623-dimensional equidistribution up to 32\n * bits accuracy. The home page for this generator is located at \u003ca\n * href\u003d\"http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/emt.html\"\u003e\n * http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/emt.html\u003c/a\u003e.\u003c/p\u003e\n\n * \u003cp\u003eThis generator is described in a paper by Makoto Matsumoto and\n * Takuji Nishimura in 1998: \u003ca\n * href\u003d\"http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/ARTICLES/mt.pdf\"\u003eMersenne\n * Twister: A 623-Dimensionally Equidistributed Uniform Pseudo-Random\n * Number Generator\u003c/a\u003e, ACM Transactions on Modeling and Computer\n * Simulation, Vol. 8, No. 1, January 1998, pp 3--30\u003c/p\u003e\n\n * \u003cp\u003eThis class is mainly a Java port of the 2002-01-26 version of\n * the generator written in C by Makoto Matsumoto and Takuji\n * Nishimura. Here is their original copyright:\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003eCopyright (C) 1997 - 2002, Makoto Matsumoto and Takuji Nishimura,\n *     All rights reserved.\u003c/td\u003e\u003c/tr\u003e\n\n * \u003ctr\u003e\u003ctd\u003eRedistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *   \u003cli\u003eRedistributions of source code must retain the above copyright\n *       notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n *   \u003cli\u003eRedistributions in binary form must reproduce the above copyright\n *       notice, this list of conditions and the following disclaimer in the\n *       documentation and/or other materials provided with the distribution.\u003c/li\u003e\n *   \u003cli\u003eThe names of its contributors may not be used to endorse or promote\n *       products derived from this software without specific prior written\n *       permission.\u003c/li\u003e\n * \u003c/ol\u003e\u003c/td\u003e\u003c/tr\u003e\n\n * \u003ctr\u003e\u003ctd\u003e\u003cstrong\u003eTHIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND\n * CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES,\n * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF\n * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE\n * DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS\n * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,\n * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,\n * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR\n * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY\n * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT\n * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE\n * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH\n * DAMAGE.\u003c/strong\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @version $Revision$ $Date$\n * @since 2.0\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Size of the bytes pool. "
    },
    {
      "type": "field",
      "varNames": [
        "M"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Period second parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "MAG01"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " X * MATRIX_A for X \u003d {0, 1}. "
    },
    {
      "type": "field",
      "varNames": [
        "mt"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Bytes pool. "
    },
    {
      "type": "field",
      "varNames": [
        "mti"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Current index in the bytes pool. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.MersenneTwister.MersenneTwister()",
      "begin_line": 104,
      "end_line": 107,
      "comment": " Creates a new random number generator.\n     * \u003cp\u003eThe instance is initialized using the current time as the\n     * seed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 24)",
        "(line 106,col 9)-(line 106,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.MersenneTwister.MersenneTwister(int)",
      "begin_line": 112,
      "end_line": 115,
      "comment": " Creates a new random number generator using a single int seed.\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 24)",
        "(line 114,col 9)-(line 114,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.MersenneTwister.MersenneTwister(int[])",
      "begin_line": 121,
      "end_line": 124,
      "comment": " Creates a new random number generator using an int array seed.\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 24)",
        "(line 123,col 9)-(line 123,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.MersenneTwister.MersenneTwister(long)",
      "begin_line": 129,
      "end_line": 132,
      "comment": " Creates a new random number generator using a single long seed.\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.MersenneTwister.setSeed(int)",
      "begin_line": 139,
      "end_line": 150,
      "comment": " Reinitialize the generator as if just built with the given int seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 27)",
        "(line 143,col 9)-(line 143,col 28)",
        "(line 144,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.MersenneTwister.setSeed(int[])",
      "begin_line": 158,
      "end_line": 199,
      "comment": " Reinitialize the generator as if just built with the given int array seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 26)",
        "(line 167,col 9)-(line 167,col 18)",
        "(line 168,col 9)-(line 168,col 18)",
        "(line 170,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.MersenneTwister.setSeed(long)",
      "begin_line": 206,
      "end_line": 209,
      "comment": " Reinitialize the generator as if just built with the given long seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.MersenneTwister.next(int)",
      "begin_line": 220,
      "end_line": 255,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 14)",
        "(line 225,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 22)",
        "(line 248,col 9)-(line 248,col 23)",
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 250,col 37)",
        "(line 251,col 9)-(line 251,col 23)",
        "(line 253,col 9)-(line 253,col 33)"
      ]
    }
  ]
}