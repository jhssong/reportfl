{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/text/VariableFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 109,
      "end_line": 932,
      "comment": "\n * \u003cp\u003e\n * Replaces variables in text with other text.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class can be given a text which can contain an arbitrary number of variables. The default notation for a\n * variable in text is \u003ccode\u003e${variableName}\u003c/code\u003e. However by calling the \u003ccode\u003esetVariablePrefix()\u003c/code\u003e and\n * \u003ccode\u003esetVariableSuffix()\u003c/code\u003e methods it is possible to use a different prefix or suffix. Variable values are\n * resolved from a map.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The simplest example is to use this class to replace Java System properties. For example:\n * \n * \u003cpre\u003e\n * VariableFormatter.replaceSystemProperties(\n *      \"You are running with java.version \u003d ${java.version} and os.name \u003d ${os.name}.\");\n * \u003c/pre\u003e\n * \n * \u003c/p\u003e\n * \u003cp\u003e\n * Typical usage of this class follows the following pattern: First an instance is created and initialized with the map\n * that contains the values for the available variables. If a prefix and/or suffix for variables should be used other\n * than the default ones, the appropriate settings can be performed. After that the \u003ccode\u003ereplace()\u003c/code\u003e method can\n * be called passing in the source text for interpolation. In the returned text all variable references (as long as\n * their values are known) will be resolved. The following example demonstrates this:\n * \u003c/p\u003e\n * \u003cp\u003e\n * \n * \u003cpre\u003e\n * Map valuesMap \u003d HashMap();\n * valuesMap.put(\u0026quot;animal\u0026quot;, \u0026quot;quick brown fox\u0026quot;);\n * valuesMap.put(\u0026quot;target\u0026quot;, \u0026quot;lazy dog\u0026quot;);\n * String templateString \u003d \u0026quot;The ${animal} jumped over the ${target}.\u0026quot;;\n * VariableFormatter vf \u003d new VariableFormatter(valuesMap);\n * String resolvedString \u003d cf.replace(templateString);\n * \u003c/pre\u003e\n * \n * yielding:\n * \n * \u003cpre\u003e\n *      The quick brown fox jumped over the lazy dog.\n * \u003c/pre\u003e\n * \n * \u003c/p\u003e\n * \u003cp\u003e\n * In addition to this usage pattern there are some static convenience methods that cover the most common use cases.\n * These methods can be used without the need of creating an instance. However if multiple replace operations are to be\n * performed, creating and reusing an instance of this class will be more efficient.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Variable replacement works in a recursive way, i.e. it is possible that a variable\u0027s value is a text which again\n * contains variable references. These new variables will be replaced, too. Cyclic replacements are detected and will\n * cause an exception to be thrown.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Sometimes the interpolation\u0027s result must contain a variable prefix. As an example take the following source text:\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003ccode\u003eThe variable ${${name}} must be used.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Here only the variable\u0027s name refered to in the text should be replaced resulting in the text (assuming that the\n * value of the \u003ccode\u003ename\u003c/code\u003e variable is \u003ccode\u003ex\u003c/code\u003e:\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003ccode\u003eThe variable ${x} must be used.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * To achieve this effect there are two possibilities: Either set a different prefix and suffix for variables which do\n * not conflict with the result text you want to produce. The other possibility is to use the escape character that can\n * be set through the \u003ccode\u003esetEscapeCharacter()\u003c/code\u003e method. If this character is placed before a variable\n * reference, this reference is ignored and won\u0027t be replaced. Per default the escape character is set to the\n * \u003ccode\u003e$\u003c/code\u003e character, so that in the example above the text could have run:\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003ccode\u003eThe variable $${${name}} must be used.\u003c/code\u003e\n * \u003c/p\u003e\n * \n * \n * @author Oliver Heger\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "class_interface",
      "name": "MapVariableResolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.VariableFormatter.VariableResolver"
      ],
      "begin_line": 117,
      "end_line": 165,
      "comment": "\n     * A VariableResolver backed by a {@link Map}.\n     * \n     * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n     * @version $Id$\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n         * Map keys are variable names and value\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.MapVariableResolver(java.util.Map)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n         * Creates a new VariableResolver backed by a Map.\n         * \n         * @param map\n         *            The variable names and values.\n         ",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.getMap()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n         * Gets the variable names and values.\n         * \n         * @return the variable names and values.\n         ",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.resolveVariable(java.lang.String)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\n         * Resolves the given variable name with the backing Map.\n         * \n         * @param varName\n         *            a variable name\n         * @return a value or \u003ccode\u003enull\u003c/code\u003e if the variable name is not in Map\n         ",
      "child_ranges": [
        "(line 150,col 13)-(line 152,col 13)",
        "(line 153,col 13)-(line 153,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.setMap(java.util.Map)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n         * Gets the variable names and values.\n         * \n         * @param map\n         *            the variable names and values.\n         ",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VariableParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 172,
      "end_line": 458,
      "comment": "\n     * A helper class for detecting variables in the source text.\n     * This class provides simple tokenizer functionality. It splits input\n     * text into tokens for text, variables, and escaped variable start tokens.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_VAR_TOKEN"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Constant for the token type ESCAPED_VAR. "
    },
    {
      "type": "field",
      "varNames": [
        "TEXT_TOKEN"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Constant for the token type TEXT. "
    },
    {
      "type": "field",
      "varNames": [
        "VARIABLE_TOKEN"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Constant for the token type VARIABLE. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.newEscapedVariableToken(int, int)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n         * Creates a new variable token.\n         * \n         * @param aStartIndex\n         *            The token starting index\n         * @param aLength\n         *            The token length\n         * @return a new token\n         ",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.newTextToken(int, int)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n         * Creates a new variable token.\n         * \n         * @param aStartIndex\n         *            The token starting index\n         * @param aLength\n         *            The token length\n         * @return a new token\n         ",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.newToken(int, int, int)",
      "begin_line": 219,
      "end_line": 224,
      "comment": "\n         * Creates a new token of the specified type.\n         * \n         * @param type\n         *            The token type\n         * @param beginIndex\n         *            The token starting index\n         * @param length\n         *            The token length\n         * @return a new token\n         ",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 55)",
        "(line 221,col 13)-(line 221,col 41)",
        "(line 222,col 13)-(line 222,col 48)",
        "(line 223,col 13)-(line 223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.newVariableToken(int, int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n         * Creates a new variable token.\n         * \n         * @param aStartIndex\n         *            The token starting index\n         * @param aLength\n         *            The token length\n         * @return a new token\n         ",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 81)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endIndex"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " Stores the end index. "
    },
    {
      "type": "field",
      "varNames": [
        "escVarMatcher"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Stores the matcher for escaped variable start tokens. "
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Stores the length of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Stores the current position. "
    },
    {
      "type": "field",
      "varNames": [
        "tokenList"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " Stores a list with the pending tokens. "
    },
    {
      "type": "field",
      "varNames": [
        "varEndMatcher"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " Stores the matcher for variable end tokens. "
    },
    {
      "type": "field",
      "varNames": [
        "varStartMatcher"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " Stores the matcher for variable start tokens. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.VariableParser(org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher, int, int)",
      "begin_line": 274,
      "end_line": 283,
      "comment": "\n         * Creates a new instance of \u003ccode\u003eVariableParser\u003c/code\u003e and initializes it.\n         * \n         * @param startMatcher\n         *            the variable start matcher\n         * @param endMatcher\n         *            the variable end matcher\n         * @param escMatcher\n         *            the escaped variable start matcher\n         * @param startPos\n         *            the start index in the source data\n         * @param length\n         *            the length of the source data\n         ",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 50)",
        "(line 277,col 13)-(line 277,col 46)",
        "(line 278,col 13)-(line 278,col 46)",
        "(line 279,col 13)-(line 279,col 34)",
        "(line 280,col 13)-(line 280,col 35)",
        "(line 281,col 13)-(line 281,col 48)",
        "(line 282,col 13)-(line 282,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.checkTextToken(int)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\n         * Checks if there is a text token before the current position.\n         * \n         * @param startPos\n         *            the start pos for the current \u003ccode\u003enextToken()\u003c/code\u003e invocation\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 294,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getEndIndex()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n         * @return Returns the endIndex.\n         ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getEscVarMatcher()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n         * @return Returns the escVarMatcher.\n         ",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getLength()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n         * @return Returns the length.\n         ",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getPos()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n         * @return Returns the pos.\n         ",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getTokenList()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n         * @return Returns the tokenList.\n         ",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getVarEndMatcher()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n         * @return Returns the varEndMatcher.\n         ",
      "child_ranges": [
        "(line 336,col 13)-(line 336,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.getVarStartMatcher()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n         * @return Returns the varStartMatcher.\n         ",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.hasNext()",
      "begin_line": 352,
      "end_line": 354,
      "comment": " Named method like java.util.Iterator#hasNext()",
      "child_ranges": [
        "(line 353,col 13)-(line 353,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.nextToken(char[])",
      "begin_line": 363,
      "end_line": 401,
      "comment": "\n         * Returns the next token in the given data.\n         * \n         * @param data\n         *            the array with the source data\n         * @return the next token or \u003cb\u003enull\u003c/b\u003e if the end is reached\n         ",
      "child_ranges": [
        "(line 364,col 13)-(line 399,col 13)",
        "(line 400,col 13)-(line 400,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setEndIndex(int)",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n         * @param endIndex\n         *            The endIndex to set.\n         ",
      "child_ranges": [
        "(line 408,col 13)-(line 408,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setEscVarMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n         * @param escVarMatcher\n         *            The escVarMatcher to set.\n         ",
      "child_ranges": [
        "(line 416,col 13)-(line 416,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setLength(int)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n         * @param length\n         *            The length to set.\n         ",
      "child_ranges": [
        "(line 424,col 13)-(line 424,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setPos(int)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n         * @param pos\n         *            The pos to set.\n         ",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setTokenList(java.util.LinkedList)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n         * @param tokenList\n         *            The tokenList to set.\n         ",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setVarEndMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n         * @param varEndMatcher\n         *            The varEndMatcher to set.\n         ",
      "child_ranges": [
        "(line 448,col 13)-(line 448,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableParser.setVarStartMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n         * @param varStartMatcher\n         *            The varStartMatcher to set.\n         ",
      "child_ranges": [
        "(line 456,col 13)-(line 456,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VariableResolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 470,
      "end_line": 481,
      "comment": "\n     * \u003cp\u003e\n     * Definition of an interface for obtaining values for variables.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Objects implementing this interface can be passed to \u003ccode\u003eVariableFormatter\u003c/code\u003e\n     * as source for the values of the variables. The interface is quite simple and defines\n     * only a single method for retrieving the value of a specified value.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableResolver.resolveVariable(java.lang.String)",
      "begin_line": 480,
      "end_line": 480,
      "comment": "\n         * Returns the value of the specified variable. The variable\u0027s value\n         * can be an arbitrary object. If no variable with the given name is known,\n         * an implementation should return \u003ccode\u003enull\u003c/code\u003e.\n         * \n         * @param varName\n         *            the name of the searched variable\n         * @return the variable\u0027s value\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": " Constant for the default escape character. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": " Constant for the default variable prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 490,
      "end_line": 490,
      "comment": " Constant for the default variable suffix. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replace(java.util.Map, java.lang.Object)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Replaces the occurrences of all variables in the given source data by\n     * their current values obtained from the passed in map.\n     * \n     * @param valueMap\n     *            the map with the values\n     * @param source\n     *            the source text\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replace(java.util.Map, java.lang.String, java.lang.String, java.lang.Object)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * Replaces the occurrences of all variables in the given source data by\n     * their current values obtained from the passed in map. This method allows\n     * to specifiy a custom variable prefix and suffix\n     * \n     * @param valueMap\n     *            the map with the values\n     * @param prefix\n     *            the prefix of variables\n     * @param suffix\n     *            the suffix of variables\n     * @param source\n     *            the source text\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replaceSystemProperties(java.lang.Object)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Replaces all variables in the given source data with values obtained\n     * from system properties.\n     * \n     * @param source\n     *            the source text\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 77)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "escapeCharacter"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": " Stores the escape character. "
    },
    {
      "type": "field",
      "varNames": [
        "variablePrefix"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": " Stores the variable prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "variableResolver"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": "\n     * Variable resolution is delegated to an implementor of VariableResolver.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "variableSuffix"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": " Stores the variable suffix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableFormatter()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Creates a new instance with defaults for variable prefix and suffix\n     * and the escaping character.\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableFormatter(java.util.Map)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Creates a new instance and initializes it. Uses defaults for variable\n     * prefix and suffix and the escaping character.\n     * \n     * @param valueMap\n     *            the map with the variables\u0027 values\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableFormatter(java.util.Map, java.lang.String, java.lang.String)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\n     * Creates a new instance and initializes it. Uses a default escaping character.\n     * \n     * @param valueMap\n     *            the map with the variables\u0027 values\n     * @param prefix\n     *            the prefix for variables\n     * @param suffix\n     *            the suffix for variables\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableFormatter(java.util.Map, java.lang.String, java.lang.String, char)",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * Creates a new instance and initializes it.\n     * \n     * @param valueMap\n     *            the map with the variables\u0027 values\n     * @param prefix\n     *            the prefix for variables\n     * @param suffix\n     *            the suffix for variables\n     * @param escape\n     *            the escape character\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.VariableFormatter.VariableFormatter(org.apache.commons.lang.text.VariableFormatter.VariableResolver, java.lang.String, java.lang.String, char)",
      "begin_line": 612,
      "end_line": 617,
      "comment": "\n     * Creates a new instance and initializes it.\n     * \n     * @param variableResolver\n     *            the variable resolver\n     * @param prefix\n     *            the prefix for variables\n     * @param suffix\n     *            the suffix for variables\n     * @param escape\n     *            the escape character\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 51)",
        "(line 614,col 9)-(line 614,col 39)",
        "(line 615,col 9)-(line 615,col 39)",
        "(line 616,col 9)-(line 616,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replace(char[])",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Replaces the occurrences of all variables in the given source array by\n     * their current values.\n     * \n     * @param data\n     *            a character array with the source data\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replace(char[], int, int)",
      "begin_line": 644,
      "end_line": 647,
      "comment": "\n     * Replaces the occurrences of all variables in the given source array by their\n     * current values. Only the specified portion of the array will be processed.\n     * \n     * @param data\n     *            a character array with the source data\n     * @param offset\n     *            the start offset; processing will start at this position\n     * @param length\n     *            the length of the portion to be processed\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 68)",
        "(line 646,col 9)-(line 646,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replace(java.lang.Object)",
      "begin_line": 658,
      "end_line": 661,
      "comment": "\n     * Replaces the occurrences of all variables in the given source data by\n     * their current values.\n     * \n     * @param source\n     *            the text to be interpolated; this can be an arbitrary object\n     *            whose \u003ccode\u003etoString()\u003c/code\u003e method will be called\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 46)",
        "(line 660,col 9)-(line 660,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.replaceObject(java.lang.Object)",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\n     * Replaces the occurrences of all variables in the given source data by\n     * their current values. If the source consists only of a single variable\n     * reference, this method directly returns the value of this variable\n     * (which can be an arbitrary object). If the source contains multiple\n     * variable references or static text, the return value will always be a\n     * String with the concatenation of all these elements.\n     * \n     * @param source\n     *            the text to be interpolated; this can be an arbitrary object\n     *            whose \u003ccode\u003etoString()\u003c/code\u003e method will be called\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.doReplace(java.lang.Object, java.util.List)",
      "begin_line": 692,
      "end_line": 698,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method for interpolating objects. It is called for recursively\n     * processing the values of resolved variables.\n     * \n     * @param obj\n     *            the data to be interpolated (as object)\n     * @param priorVariables\n     *            keeps track of the replaced variables\n     * @return the result of the interpolation process\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 51)",
        "(line 697,col 9)-(line 697,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.doReplace(char[], int, int, java.lang.Object, java.util.List)",
      "begin_line": 717,
      "end_line": 795,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method, which resolves the values of all variable references\n     * contained in the passed in text.\n     * \n     * @param data\n     *            the text to be interpolated (as character array)\n     * @param offset\n     *            the start offset in the text array\n     * @param length\n     *            the length of the data to be processed\n     * @param ref\n     *            a reference object which will be returned if no interpolation was performed\n     * @param priorVariables\n     *            keeps track of the replaced variables\n     * @return the result of the interpolation process\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 722,col 31)",
        "(line 723,col 9)-(line 723,col 25)",
        "(line 724,col 9)-(line 724,col 48)",
        "(line 727,col 9)-(line 730,col 9)",
        "(line 732,col 9)-(line 732,col 67)",
        "(line 733,col 9)-(line 733,col 26)",
        "(line 734,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 794,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.getLength(java.text.FieldPosition)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n     * Gets the length from the parsed token.\n     * \n     * @param tok  the token\n     * @return the length\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.createParser(char[], int, int)",
      "begin_line": 818,
      "end_line": 823,
      "comment": "\n     * Creates a parser object for tokenizing the input data.\n     * \n     * @param data\n     *            the input data\n     * @param offset\n     *            the offset in the source array\n     * @param length\n     *            the length of the data to be processed\n     * @return the parser\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 822,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.resolveVariable(java.lang.String)",
      "begin_line": 836,
      "end_line": 841,
      "comment": "\n     * Resolves the specified variable. This method is called whenever a variable\n     * reference is detected in the source text. It is passed the variable\u0027s name\n     * and must return the corresponding value. This implementation accesses the\n     * value map using the variable\u0027s name as key. Derived classes may override\n     * this method to implement a different strategy for resolving variables.\n     * \n     * @param name\n     *            the name of the variable\n     * @return the variable\u0027s value or \u003cb\u003enull\u003c/b\u003e if the variable is unknown\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.getEscapeCharacter()",
      "begin_line": 849,
      "end_line": 851,
      "comment": "\n     * Returns the escape character.\n     * \n     * @return the character used for escaping variable references\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.setEscapeCharacter(char)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "\n     * Sets the escape character.\n     * If this character is placed before a variable reference in the source\n     * text, this variable will be ignored.\n     * \n     * @param escapeCharacter\n     *            the escape character (0 for disabling escaping)\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.getVariablePrefix()",
      "begin_line": 870,
      "end_line": 872,
      "comment": "\n     * Returns the prefix for variables.\n     * \n     * @return the prefix for variables\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.setVariablePrefix(java.lang.String)",
      "begin_line": 882,
      "end_line": 887,
      "comment": "\n     * Sets the prefix for variables.\n     * \n     * @param variablePrefix\n     *            the prefix for variables, not null\n     * @throws IllegalArgumentException\n     *             if the prefix is \u003cb\u003enull\u003c/b\u003e\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.getVariableSuffix()",
      "begin_line": 894,
      "end_line": 896,
      "comment": "\n     * Returns the suffix for variables.\n     * \n     * @return the suffix for variables\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.setVariableSuffix(java.lang.String)",
      "begin_line": 906,
      "end_line": 911,
      "comment": "\n     * Sets the suffix for variables\n     * \n     * @param variableSuffix\n     *            the suffix for variables, not null\n     * @throws IllegalArgumentException\n     *             if the prefix is \u003cb\u003enull\u003c/b\u003e\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.getVariableResolver()",
      "begin_line": 918,
      "end_line": 920,
      "comment": "\n     * Gets the VariableResolver\n     * \n     * @return the VariableResolver\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatter.setVariableResolver(org.apache.commons.lang.text.VariableFormatter.VariableResolver)",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * Sets the VariableResolver\n     * \n     * @param variableResolver\n     *            the VariableResolver\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 49)"
      ]
    }
  ]
}