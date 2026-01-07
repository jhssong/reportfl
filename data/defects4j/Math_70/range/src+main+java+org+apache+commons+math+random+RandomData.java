{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/RandomData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomData",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 272,
      "comment": "\n * Random data generation utilities.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextHexString(int)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Generates a random string of hex characters of length\n     * \u003ccode\u003elen\u003c/code\u003e.\n     * \u003cp\u003e\n     * The generated string will be random, but not cryptographically\n     * secure. To generate cryptographically secure strings, use\n     * \u003ccode\u003enextSecureHexString\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elen \u003e 0\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param len the length of the string to be generated\n     * @return random string of hex characters of length \u003ccode\u003elen\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextInt(int, int)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Generates a uniformly distributed random integer between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e (endpoints included).\n     * \u003cp\u003e\n     * The generated integer will be random, but not cryptographically secure.\n     * To generate cryptographically secure integer sequences, use\n     * \u003ccode\u003enextSecureInt\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elower \u003c upper\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a random integer greater than or equal to \u003ccode\u003elower\u003c/code\u003e\n     * and less than or equal to \u003ccode\u003eupper\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextLong(long, long)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Generates a uniformly distributed random long integer between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e (endpoints included).\n     * \u003cp\u003e\n     * The generated long integer values will be random, but not\n     * cryptographically secure.\n     * To generate cryptographically secure sequences of longs, use\n     * \u003ccode\u003enextSecureLong\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elower \u003c upper\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a random integer greater than or equal to \u003ccode\u003elower\u003c/code\u003e\n     * and less than or equal to \u003ccode\u003eupper\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextSecureHexString(int)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Generates a random string of hex characters from a secure random\n     * sequence.\n     * \u003cp\u003e\n     * If cryptographic security is not required,\n     * use \u003ccode\u003enextHexString()\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elen \u003e 0\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param len length of return string\n     * @return the random hex string\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextSecureInt(int, int)",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Generates a uniformly distributed random integer between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e (endpoints included)\n     * from a secure random sequence.\n     * \u003cp\u003e\n     * Sequences of integers generated using this method will be\n     * cryptographically secure. If cryptographic security is not required,\n     * \u003ccode\u003enextInt\u003c/code\u003e should be used instead of this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cryptographically_secure_pseudo-random_number_generator\"\u003e\n     * Secure Random Sequence\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elower \u003c upper\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a random integer greater than or equal to \u003ccode\u003elower\u003c/code\u003e\n     * and less than or equal to \u003ccode\u003eupper\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextSecureLong(long, long)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Generates a random long integer between \u003ccode\u003elower\u003c/code\u003e\n     * and \u003ccode\u003eupper\u003c/code\u003e (endpoints included).\n     * \u003cp\u003e\n     * Sequences of long values generated using this method will be\n     * cryptographically secure. If cryptographic security is not required,\n     * \u003ccode\u003enextLong\u003c/code\u003e should be used instead of this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cryptographically_secure_pseudo-random_number_generator\"\u003e\n     * Secure Random Sequence\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elower \u003c upper\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a long integer greater than or equal to \u003ccode\u003elower\u003c/code\u003e\n     * and less than or equal to \u003ccode\u003eupper\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextPoisson(double)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Generates a random value from the Poisson distribution with\n     * the given mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda366j.htm\"\u003e\n     * Poisson Distribution\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eThe specified mean \u003ci\u003emust\u003c/i\u003e be positive (otherwise an\n     *     IllegalArgumentException is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param mean Mean of the distribution\n     * @return poisson deviate with the specified mean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextGaussian(double, double)",
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Generates a random value from the\n     * Normal (or Gaussian) distribution with the given mean\n     * and standard deviation.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3661.htm\"\u003e\n     * Normal Distribution\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003esigma \u003e 0\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param mu Mean of the distribution\n     * @param sigma Standard deviation of the distribution\n     * @return random value from Gaussian distribution with mean \u003d mu,\n     * standard deviation \u003d sigma\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextExponential(double)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * Generates a random value from the exponential distribution\n     * with expected value \u003d \u003ccode\u003emean\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3667.htm\"\u003e\n     * Exponential Distribution\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003emu \u003e\u003d 0\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * @param mean Mean of the distribution\n     * @return random value from exponential distribution\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextUniform(double, double)",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * Generates a uniformly distributed random value from the open interval\n     * (\u003ccode\u003elower\u003c/code\u003e,\u003ccode\u003eupper\u003c/code\u003e) (i.e., endpoints excluded).\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3662.htm\"\u003e\n     * Uniform Distribution\u003c/a\u003e \u003ccode\u003elower\u003c/code\u003e and\n     * \u003ccode\u003eupper - lower\u003c/code\u003e are the\n     * \u003ca href \u003d \"http://www.itl.nist.gov/div898/handbook/eda/section3/eda364.htm\"\u003e\n     * location and scale parameters\u003c/a\u003e, respectively.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003elower \u003c upper\u003c/code\u003e (otherwise an IllegalArgumentException\n     *     is thrown.)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param lower lower endpoint of the interval of support\n     * @param upper upper endpoint of the interval of support\n     * @return uniformly distributed random value between lower\n     * and upper (exclusive)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextPermutation(int, int)",
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Generates an integer array of length \u003ccode\u003ek\u003c/code\u003e whose entries\n     * are selected randomly, without repetition, from the integers \u003ccode\u003e\n     * 0 through n-1\u003c/code\u003e (inclusive).\n     * \u003cp\u003e\n     * Generated arrays represent permutations\n     * of \u003ccode\u003en\u003c/code\u003e taken \u003ccode\u003ek\u003c/code\u003e at a time.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003ek \u003c\u003d n\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e 0\u003c/code\u003e \u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the preconditions are not met, an IllegalArgumentException is\n     * thrown.\u003c/p\u003e\n     *\n     * @param n domain of the permutation\n     * @param k size of the permutation\n     * @return random k-permutation of n\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomData.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 271,
      "end_line": 271,
      "comment": "\n     * Returns an array of \u003ccode\u003ek\u003c/code\u003e objects selected randomly\n     * from the Collection \u003ccode\u003ec\u003c/code\u003e.\n     * \u003cp\u003e\n     * Sampling from \u003ccode\u003ec\u003c/code\u003e\n     * is without replacement; but if \u003ccode\u003ec\u003c/code\u003e contains identical\n     * objects, the sample may include repeats.  If all elements of \u003ccode\u003e\n     * c\u003c/code\u003e are distinct, the resulting object array represents a\n     * \u003ca href\u003d\"http://rkb.home.cern.ch/rkb/AN16pp/node250.html#SECTION0002500000000000000000\"\u003e\n     * Simple Random Sample\u003c/a\u003e of size\n     * \u003ccode\u003ek\u003c/code\u003e from the elements of \u003ccode\u003ec\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003e k must be less than or equal to the size of c \u003c/li\u003e\n     * \u003cli\u003e c must not be empty \u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the preconditions are not met, an IllegalArgumentException is\n     * thrown.\u003c/p\u003e\n     *\n     * @param c collection to be sampled\n     * @param k size of the sample\n     * @return random sample of k elements from c\n     ",
      "child_ranges": []
    }
  ]
}