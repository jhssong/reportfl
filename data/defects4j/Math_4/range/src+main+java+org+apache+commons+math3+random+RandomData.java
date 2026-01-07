{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/RandomData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomData",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 264,
      "comment": "\n * Random data generation utilities.\n * @deprecated to be removed in 4.0.  Use {@link RandomDataGenerator} directly\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextHexString(int)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Generates a random string of hex characters of length {@code len}.\n     * \u003cp\u003e\n     * The generated string will be random, but not cryptographically\n     * secure. To generate cryptographically secure strings, use\n     * {@link #nextSecureHexString(int)}.\n     * \u003c/p\u003e\n     *\n     * @param len the length of the string to be generated\n     * @return a random string of hex characters of length {@code len}\n     * @throws NotStrictlyPositiveException\n     * if {@code len \u003c\u003d 0}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextInt(int, int)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Generates a uniformly distributed random integer between {@code lower}\n     * and {@code upper} (endpoints included).\n     * \u003cp\u003e\n     * The generated integer will be random, but not cryptographically secure.\n     * To generate cryptographically secure integer sequences, use\n     * {@link #nextSecureInt(int, int)}.\n     * \u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a random integer greater than or equal to {@code lower}\n     * and less than or equal to {@code upper}\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextLong(long, long)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Generates a uniformly distributed random long integer between\n     * {@code lower} and {@code upper} (endpoints included).\n     * \u003cp\u003e\n     * The generated long integer values will be random, but not\n     * cryptographically secure. To generate cryptographically secure sequences\n     * of longs, use {@link #nextSecureLong(long, long)}.\n     * \u003c/p\u003e\n     *\n     * @param lower lower bound for generated long integer\n     * @param upper upper bound for generated long integer\n     * @return a random long integer greater than or equal to {@code lower} and\n     * less than or equal to {@code upper}\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextSecureHexString(int)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Generates a random string of hex characters from a secure random\n     * sequence.\n     * \u003cp\u003e\n     * If cryptographic security is not required, use\n     * {@link #nextHexString(int)}.\n     * \u003c/p\u003e\n     *\n     * @param len the length of the string to be generated\n     * @return a random string of hex characters of length {@code len}\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextSecureInt(int, int)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Generates a uniformly distributed random integer between {@code lower}\n     * and {@code upper} (endpoints included) from a secure random sequence.\n     * \u003cp\u003e\n     * Sequences of integers generated using this method will be\n     * cryptographically secure. If cryptographic security is not required,\n     * {@link #nextInt(int, int)} should be used instead of this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cryptographically_secure_pseudo-random_number_generator\"\u003e\n     * Secure Random Sequence\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a random integer greater than or equal to {@code lower} and less\n     * than or equal to {@code upper}.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextSecureLong(long, long)",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Generates a uniformly distributed random long integer between\n     * {@code lower} and {@code upper} (endpoints included) from a secure random\n     * sequence.\n     * \u003cp\u003e\n     * Sequences of long values generated using this method will be\n     * cryptographically secure. If cryptographic security is not required,\n     * {@link #nextLong(long, long)} should be used instead of this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cryptographically_secure_pseudo-random_number_generator\"\u003e\n     * Secure Random Sequence\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param lower lower bound for generated integer\n     * @param upper upper bound for generated integer\n     * @return a random long integer greater than or equal to {@code lower} and\n     * less than or equal to {@code upper}.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextPoisson(double)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Generates a random value from the Poisson distribution with the given\n     * mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda366j.htm\"\u003e\n     * Poisson Distribution\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param mean the mean of the Poisson distribution\n     * @return a random value following the specified Poisson distribution\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextGaussian(double, double)",
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Generates a random value from the Normal (or Gaussian) distribution with\n     * specified mean and standard deviation.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3661.htm\"\u003e\n     * Normal Distribution\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param mu the mean of the distribution\n     * @param sigma the standard deviation of the distribution\n     * @return a random value following the specified Gaussian distribution\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextExponential(double)",
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n     * Generates a random value from the exponential distribution\n     * with specified mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3667.htm\"\u003e\n     * Exponential Distribution\u003c/a\u003e\u003c/p\u003e\n     *\n     * @param mean the mean of the distribution\n     * @return a random value following the specified exponential distribution\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextUniform(double, double)",
      "begin_line": 197,
      "end_line": 198,
      "comment": "\n     * Generates a uniformly distributed random value from the open interval\n     * {@code (lower, upper)} (i.e., endpoints excluded).\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3662.htm\"\u003e\n     * Uniform Distribution\u003c/a\u003e {@code lower} and {@code upper - lower} are the\n     * \u003ca href \u003d \"http://www.itl.nist.gov/div898/handbook/eda/section3/eda364.htm\"\u003e\n     * location and scale parameters\u003c/a\u003e, respectively.\u003c/p\u003e\n     *\n     * @param lower the exclusive lower bound of the support\n     * @param upper the exclusive upper bound of the support\n     * @return a uniformly distributed random value between lower and upper\n     * (exclusive)\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}\n     * @throws NotFiniteNumberException if one of the bounds is infinite\n     * @throws NotANumberException if one of the bounds is NaN\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextUniform(double, double, boolean)",
      "begin_line": 223,
      "end_line": 224,
      "comment": "\n     * Generates a uniformly distributed random value from the interval\n     * {@code (lower, upper)} or the interval {@code [lower, upper)}. The lower\n     * bound is thus optionally included, while the upper bound is always\n     * excluded.\n     * \u003cp\u003e\n     * \u003cstrong\u003eDefinition\u003c/strong\u003e:\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/eda/section3/eda3662.htm\"\u003e\n     * Uniform Distribution\u003c/a\u003e {@code lower} and {@code upper - lower} are the\n     * \u003ca href \u003d \"http://www.itl.nist.gov/div898/handbook/eda/section3/eda364.htm\"\u003e\n     * location and scale parameters\u003c/a\u003e, respectively.\u003c/p\u003e\n     *\n     * @param lower the lower bound of the support\n     * @param upper the exclusive upper bound of the support\n     * @param lowerInclusive {@code true} if the lower bound is inclusive\n     * @return uniformly distributed random value in the {@code (lower, upper)}\n     * interval, if {@code lowerInclusive} is {@code false}, or in the\n     * {@code [lower, upper)} interval, if {@code lowerInclusive} is\n     * {@code true}\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}\n     * @throws NotFiniteNumberException if one of the bounds is infinite\n     * @throws NotANumberException if one of the bounds is NaN\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextPermutation(int, int)",
      "begin_line": 241,
      "end_line": 242,
      "comment": "\n     * Generates an integer array of length {@code k} whose entries are selected\n     * randomly, without repetition, from the integers {@code 0, ..., n - 1}\n     * (inclusive).\n     * \u003cp\u003e\n     * Generated arrays represent permutations of {@code n} taken {@code k} at a\n     * time.\u003c/p\u003e\n     *\n     * @param n the domain of the permutation\n     * @param k the size of the permutation\n     * @return a random {@code k}-permutation of {@code n}, as an array of\n     * integers\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomData.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 261,
      "end_line": 262,
      "comment": "\n     * Returns an array of {@code k} objects selected randomly from the\n     * Collection {@code c}.\n     * \u003cp\u003e\n     * Sampling from {@code c} is without replacement; but if {@code c} contains\n     * identical objects, the sample may include repeats.  If all elements of\n     * {@code c} are distinct, the resulting object array represents a\n     * \u003ca href\u003d\"http://rkb.home.cern.ch/rkb/AN16pp/node250.html#SECTION0002500000000000000000\"\u003e\n     * Simple Random Sample\u003c/a\u003e of size {@code k} from the elements of\n     * {@code c}.\u003c/p\u003e\n     *\n     * @param c the collection to be sampled\n     * @param k the size of the sample\n     * @return a random sample of {@code k} elements from {@code c}\n     * @throws NumberIsTooLargeException if {@code k \u003e c.size()}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": []
    }
  ]
}