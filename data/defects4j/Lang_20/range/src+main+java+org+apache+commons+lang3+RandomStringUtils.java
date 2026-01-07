{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/RandomStringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomStringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 322,
      "comment": "\n * \u003cp\u003eOperations for random {@code String}s.\u003c/p\u003e\n * \u003cp\u003eCurrently \u003cem\u003eprivate high surrogate\u003c/em\u003e characters are ignored. \n * These are unicode characters that fall between the values 56192 (db80)\n * and 56319 (dbff) as we don\u0027t know how to handle them. \n * High and low surrogates are correctly dealt with - that is if a \n * high surrogate is randomly chosen, 55296 (d800) to 56191 (db7f) \n * then it is followed by a low surrogate. If a low surrogate is chosen, \n * 56320 (dc00) to 57343 (dfff) then it is placed after a randomly \n * chosen high surrogate. \u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RANDOM"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * \u003cp\u003eRandom object used by random method. This has to be not local\n     * to the random method so as to not return the same value in the \n     * same millisecond.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.RandomStringUtils.RandomStringUtils()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003e{@code RandomStringUtils} instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * {@code RandomStringUtils.random(5);}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 54,col 7)-(line 54,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of all characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomAscii(int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of characters whose\n     * ASCII value is between {@code 32} and {@code 126} (inclusive).\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alphabetic\n     * characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alpha-numeric\n     * characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomNumeric(int)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of numeric\n     * characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, boolean, boolean)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alpha-numeric\n     * characters as indicated by the arguments.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param letters  if {@code true}, generated string will include\n     *  alphabetic characters\n     * @param numbers  if {@code true}, generated string will include\n     *  numeric characters\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, int, int, boolean, boolean)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alpha-numeric\n     * characters as indicated by the arguments.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param start  the position in set of chars to start at\n     * @param end  the position in set of chars to end before\n     * @param letters  if {@code true}, generated string will include\n     *  alphabetic characters\n     * @param numbers  if {@code true}, generated string will include\n     *  numeric characters\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, int, int, boolean, boolean, char...)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eCreates a random string based on a variety of options, using\n     * default source of randomness.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method has exactly the same semantics as\n     * {@link #random(int,int,int,boolean,boolean,char[],Random)}, but\n     * instead of using an externally supplied source of randomness, it uses\n     * the internal static {@link Random} instance.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param start  the position in set of chars to start at\n     * @param end  the position in set of chars to end before\n     * @param letters  only allow letters?\n     * @param numbers  only allow numbers?\n     * @param chars  the set of chars to choose randoms from.\n     *  If {@code null}, then it will use the set of all chars.\n     * @return the random string\n     * @throws ArrayIndexOutOfBoundsException if there are not\n     *  {@code (end - start) + 1} characters in the set array.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, int, int, boolean, boolean, char[], java.util.Random)",
      "begin_line": 223,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eCreates a random string based on a variety of options, using\n     * supplied source of randomness.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf start and end are both {@code 0}, start and end are set\n     * to {@code \u0027 \u0027} and {@code \u0027z\u0027}, the ASCII printable\n     * characters, will be used, unless letters and numbers are both\n     * {@code false}, in which case, start and end are set to\n     * {@code 0} and {@code Integer.MAX_VALUE}.\n     *\n     * \u003cp\u003eIf set is not {@code null}, characters between start and\n     * end are chosen.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method accepts a user-supplied {@link Random}\n     * instance to use as a source of randomness. By seeding a single \n     * {@link Random} instance with a fixed seed and using it for each call,\n     * the same random sequence of strings can be generated repeatedly\n     * and predictably.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param start  the position in set of chars to start at\n     * @param end  the position in set of chars to end before\n     * @param letters  only allow letters?\n     * @param numbers  only allow numbers?\n     * @param chars  the set of chars to choose randoms from.\n     *  If {@code null}, then it will use the set of all chars.\n     * @param random  a source of randomness.\n     * @return the random string\n     * @throws ArrayIndexOutOfBoundsException if there are not\n     *  {@code (end - start) + 1} characters in the set array.\n     * @throws IllegalArgumentException if {@code count} \u0026lt; 0.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 30)",
        "(line 242,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, java.lang.String)",
      "begin_line": 296,
      "end_line": 301,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of characters\n     * specified.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param chars  the String containing the set of characters to use,\n     *  may be null\n     * @return the random string\n     * @throws IllegalArgumentException if {@code count} \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, char...)",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of characters specified.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param chars  the character array containing the set of characters to use,\n     *  may be null\n     * @return the random string\n     * @throws IllegalArgumentException if {@code count} \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 75)"
      ]
    }
  ]
}