{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/exception/util/ExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionContext",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 312,
      "comment": "\n * Class that contains the actual implementation of the functionality mandated\n * by the {@link ExceptionContext} interface.\n * All Commons Math exceptions delegate the interface\u0027s methods to this class.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "msgPatterns"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Various informations that enrich the informative message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "msgArguments"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Various informations that enrich the informative message.\n     * The arguments will replace the corresponding place-holders in\n     * {@link #msgPatterns}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Arbitrary context information.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Adds a message.\n     *\n     * @param pattern Message pattern.\n     * @param arguments Values for replacing the placeholders in the message\n     * pattern.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Sets the context (key, value) pair.\n     * Keys are assumed to be unique within an instance. If the same key is\n     * assigned a new value, the previous one will be lost.\n     *\n     * @param key Context key (not null).\n     * @param value Context value.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.getValue(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Gets the value associated to the given context key.\n     *\n     * @param key Context key.\n     * @return the context value or {@code null} if the key does not exist.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.getKeys()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Gets all the keys stored in the exception\n     *\n     * @return the set of keys.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.getMessage()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Gets the default message.\n     *\n     * @return the message.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.getLocalizedMessage()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Gets the message in the default locale.\n     *\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.getMessage(java.util.Locale)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.getMessage(java.util.Locale, java.lang.String)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Separator inserted between the message parts.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.buildMessage(java.util.Locale, java.lang.String)",
      "begin_line": 148,
      "end_line": 166,
      "comment": "\n     * Builds a message string.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Message separator.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 53)",
        "(line 151,col 9)-(line 151,col 22)",
        "(line 152,col 9)-(line 152,col 43)",
        "(line 153,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 174,
      "end_line": 178,
      "comment": "\n     * Serialize this object to the given stream.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 31)",
        "(line 177,col 9)-(line 177,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.readObject(java.io.ObjectInputStream)",
      "begin_line": 186,
      "end_line": 191,
      "comment": "\n     * Deserialize this object from the given stream.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 32)",
        "(line 190,col 9)-(line 190,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.serializeMessages(java.io.ObjectOutputStream)",
      "begin_line": 199,
      "end_line": 223,
      "comment": "\n     * Serialize  {@link #msgPatterns} and {@link #msgArguments}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 26)",
        "(line 205,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.deSerializeMessages(java.io.ObjectInputStream)",
      "begin_line": 232,
      "end_line": 253,
      "comment": "\n     * Deserialize {@link #msgPatterns} and {@link #msgArguments}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 237,col 54)",
        "(line 238,col 9)-(line 238,col 52)",
        "(line 240,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.serializeContext(java.io.ObjectOutputStream)",
      "begin_line": 261,
      "end_line": 278,
      "comment": "\n     * Serialize {@link #context}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.deSerializeContext(java.io.ObjectInputStream)",
      "begin_line": 287,
      "end_line": 300,
      "comment": "\n     * Deserialize {@link #context}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 292,col 48)",
        "(line 293,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.ExceptionContext.nonSerializableReplacement(java.lang.Object)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Replaces a non-serializable object with an error message string.\n     *\n     * @param obj Object that does not implement the {@code Serializable}\n     * interface.\n     * @return a string that mentions which class could not be serialized.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 84)"
      ]
    }
  ]
}