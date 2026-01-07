{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/util/ExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionContext",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 335,
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
        "throwable"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The throwable to which this context refers to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "msgPatterns"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Various informations that enrich the informative message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "msgArguments"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Various informations that enrich the informative message.\n     * The arguments will replace the corresponding place-holders in\n     * {@link #msgPatterns}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Arbitrary context information.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.ExceptionContext(java.lang.Throwable)",
      "begin_line": 64,
      "end_line": 69,
      "comment": " Simple constructor.\n     * @param throwable the exception this context refers too\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 35)",
        "(line 66,col 9)-(line 66,col 54)",
        "(line 67,col 9)-(line 67,col 51)",
        "(line 68,col 9)-(line 68,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getThrowable()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Get a reference to the exception to which the context relates.\n     * @return a reference to the exception to which the context relates\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.addMessage(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Adds a message.\n     *\n     * @param pattern Message pattern.\n     * @param arguments Values for replacing the placeholders in the message\n     * pattern.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 33)",
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Sets the context (key, value) pair.\n     * Keys are assumed to be unique within an instance. If the same key is\n     * assigned a new value, the previous one will be lost.\n     *\n     * @param key Context key (not null).\n     * @param value Context value.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getValue(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Gets the value associated to the given context key.\n     *\n     * @param key Context key.\n     * @return the context value or {@code null} if the key does not exist.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getKeys()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Gets all the keys stored in the exception\n     *\n     * @return the set of keys.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getMessage()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Gets the default message.\n     *\n     * @return the message.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getLocalizedMessage()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Gets the message in the default locale.\n     *\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getMessage(java.util.Locale)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.getMessage(java.util.Locale, java.lang.String)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Separator inserted between the message parts.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.buildMessage(java.util.Locale, java.lang.String)",
      "begin_line": 169,
      "end_line": 187,
      "comment": "\n     * Builds a message string.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param separator Message separator.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 53)",
        "(line 172,col 9)-(line 172,col 22)",
        "(line 173,col 9)-(line 173,col 43)",
        "(line 174,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 195,
      "end_line": 200,
      "comment": "\n     * Serialize this object to the given stream.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 35)",
        "(line 198,col 9)-(line 198,col 31)",
        "(line 199,col 9)-(line 199,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.readObject(java.io.ObjectInputStream)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Deserialize this object from the given stream.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 32)",
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.serializeMessages(java.io.ObjectOutputStream)",
      "begin_line": 222,
      "end_line": 246,
      "comment": "\n     * Serialize  {@link #msgPatterns} and {@link #msgArguments}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 43)",
        "(line 226,col 9)-(line 226,col 26)",
        "(line 228,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.deSerializeMessages(java.io.ObjectInputStream)",
      "begin_line": 255,
      "end_line": 276,
      "comment": "\n     * Deserialize {@link #msgPatterns} and {@link #msgArguments}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 37)",
        "(line 260,col 9)-(line 260,col 54)",
        "(line 261,col 9)-(line 261,col 52)",
        "(line 263,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.serializeContext(java.io.ObjectOutputStream)",
      "begin_line": 284,
      "end_line": 301,
      "comment": "\n     * Serialize {@link #context}.\n     *\n     * @param out Stream.\n     * @throws IOException This should never happen.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 48)",
        "(line 288,col 9)-(line 288,col 26)",
        "(line 289,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.deSerializeContext(java.io.ObjectInputStream)",
      "begin_line": 310,
      "end_line": 323,
      "comment": "\n     * Deserialize {@link #context}.\n     *\n     * @param in Stream.\n     * @throws IOException This should never happen.\n     * @throws ClassNotFoundException This should never happen.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 315,col 48)",
        "(line 316,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.ExceptionContext.nonSerializableReplacement(java.lang.Object)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Replaces a non-serializable object with an error message string.\n     *\n     * @param obj Object that does not implement the {@code Serializable}\n     * interface.\n     * @return a string that mentions which class could not be serialized.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 84)"
      ]
    }
  ]
}