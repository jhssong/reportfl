{
  "filepath": "/tmp/Lang-23b/src/main/java/org/apache/commons/lang3/RandomStringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomStringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 326,
      "comment": "\n * \u003cp\u003eOperations for random \u003ccode\u003eString\u003c/code\u003es.\u003c/p\u003e\n * \u003cp\u003eCurrently \u003cem\u003eprivate high surrogate\u003c/em\u003e characters are ignored. \n * These are unicode characters that fall between the values 56192 (db80)\n * and 56319 (dbff) as we don\u0027t know how to handle them. \n * High and low surrogates are correctly dealt with - that is if a \n * high surrogate is randomly chosen, 55296 (d800) to 56191 (db7f) \n * then it is followed by a low surrogate. If a low surrogate is chosen, \n * 56320 (dc00) to 57343 (dfff) then it is placed after a randomly \n * chosen high surrogate. \u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author Gary Gregory\n * @author Phil Steitz\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RANDOM"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * \u003cp\u003eRandom object used by random method. This has to be not local\n     * to the random method so as to not return the same value in the \n     * same millisecond.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.RandomStringUtils.RandomStringUtils()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eRandomStringUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eRandomStringUtils.random(5);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 7)-(line 57,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of all characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomAscii(int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of characters whose\n     * ASCII value is between \u003ccode\u003e32\u003c/code\u003e and \u003ccode\u003e126\u003c/code\u003e (inclusive).\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alphabetic\n     * characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(int)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alpha-numeric\n     * characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.randomNumeric(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of numeric\n     * characters.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, boolean, boolean)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alpha-numeric\n     * characters as indicated by the arguments.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param letters  if \u003ccode\u003etrue\u003c/code\u003e, generated string will include\n     *  alphabetic characters\n     * @param numbers  if \u003ccode\u003etrue\u003c/code\u003e, generated string will include\n     *  numeric characters\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, int, int, boolean, boolean)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of alpha-numeric\n     * characters as indicated by the arguments.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param start  the position in set of chars to start at\n     * @param end  the position in set of chars to end before\n     * @param letters  if \u003ccode\u003etrue\u003c/code\u003e, generated string will include\n     *  alphabetic characters\n     * @param numbers  if \u003ccode\u003etrue\u003c/code\u003e, generated string will include\n     *  numeric characters\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, int, int, boolean, boolean, char[])",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eCreates a random string based on a variety of options, using\n     * default source of randomness.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method has exactly the same semantics as\n     * {@link #random(int,int,int,boolean,boolean,char[],Random)}, but\n     * instead of using an externally supplied source of randomness, it uses\n     * the internal static {@link Random} instance.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param start  the position in set of chars to start at\n     * @param end  the position in set of chars to end before\n     * @param letters  only allow letters?\n     * @param numbers  only allow numbers?\n     * @param chars  the set of chars to choose randoms from.\n     *  If \u003ccode\u003enull\u003c/code\u003e, then it will use the set of all chars.\n     * @return the random string\n     * @throws ArrayIndexOutOfBoundsException if there are not\n     *  \u003ccode\u003e(end - start) + 1\u003c/code\u003e characters in the set array.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, int, int, boolean, boolean, char[], java.util.Random)",
      "begin_line": 226,
      "end_line": 285,
      "comment": "\n     * \u003cp\u003eCreates a random string based on a variety of options, using\n     * supplied source of randomness.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf start and end are both \u003ccode\u003e0\u003c/code\u003e, start and end are set\n     * to \u003ccode\u003e\u0027 \u0027\u003c/code\u003e and \u003ccode\u003e\u0027z\u0027\u003c/code\u003e, the ASCII printable\n     * characters, will be used, unless letters and numbers are both\n     * \u003ccode\u003efalse\u003c/code\u003e, in which case, start and end are set to\n     * \u003ccode\u003e0\u003c/code\u003e and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\n     *\n     * \u003cp\u003eIf set is not \u003ccode\u003enull\u003c/code\u003e, characters between start and\n     * end are chosen.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method accepts a user-supplied {@link Random}\n     * instance to use as a source of randomness. By seeding a single \n     * {@link Random} instance with a fixed seed and using it for each call,\n     * the same random sequence of strings can be generated repeatedly\n     * and predictably.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param start  the position in set of chars to start at\n     * @param end  the position in set of chars to end before\n     * @param letters  only allow letters?\n     * @param numbers  only allow numbers?\n     * @param chars  the set of chars to choose randoms from.\n     *  If \u003ccode\u003enull\u003c/code\u003e, then it will use the set of all chars.\n     * @param random  a source of randomness.\n     * @return the random string\n     * @throws ArrayIndexOutOfBoundsException if there are not\n     *  \u003ccode\u003e(end - start) + 1\u003c/code\u003e characters in the set array.\n     * @throws IllegalArgumentException if \u003ccode\u003ecount\u003c/code\u003e \u0026lt; 0.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 30)",
        "(line 245,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, java.lang.String)",
      "begin_line": 300,
      "end_line": 305,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of characters\n     * specified.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param chars  the String containing the set of characters to use,\n     *  may be null\n     * @return the random string\n     * @throws IllegalArgumentException if \u003ccode\u003ecount\u003c/code\u003e \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.RandomStringUtils.random(int, char[])",
      "begin_line": 319,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eCreates a random string whose length is the number of characters\n     * specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eCharacters will be chosen from the set of characters specified.\u003c/p\u003e\n     *\n     * @param count  the length of random string to create\n     * @param chars  the character array containing the set of characters to use,\n     *  may be null\n     * @return the random string\n     * @throws IllegalArgumentException if \u003ccode\u003ecount\u003c/code\u003e \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 75)"
      ]
    }
  ]
}