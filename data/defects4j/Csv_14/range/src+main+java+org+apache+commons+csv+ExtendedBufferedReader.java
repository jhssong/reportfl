{
  "filepath": "/tmp/Csv-14b/src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedBufferedReader",
      "is_interface": false,
      "parent_types": [
        "java.io.BufferedReader"
      ],
      "begin_line": 38,
      "end_line": 193,
      "comment": "\n * A special buffered reader which supports sophisticated read access.\n * \u003cp\u003e\n * In particular the reader supports a look-ahead option, which allows you to see the next char returned by\n * {@link #read()}. This reader also tracks how many characters have been read with {@link #getPosition()}.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastChar"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The last char returned "
    },
    {
      "type": "field",
      "varNames": [
        "eolCounter"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The count of EOLs (CR/LF/CRLF) seen so far "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The position, which is number of characters read so far "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.ExtendedBufferedReader(java.io.Reader)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Created extended buffered reader using default buffer-size\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.read()",
      "begin_line": 58,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 41)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 27)",
        "(line 65,col 9)-(line 65,col 24)",
        "(line 66,col 9)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getLastChar()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns the last character that was read as an integer (0 to 65535). This will be the last character returned by\n     * any of the read methods. This will not include a character read using the {@link #lookAhead()} method. If no\n     * character has been read then this will return {@link Constants#UNDEFINED}. If the end of the stream was reached\n     * on the last read then this will return {@link Constants#END_OF_STREAM}.\n     *\n     * @return the last character that was read\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.read(char[], int, int)",
      "begin_line": 81,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 56)",
        "(line 89,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.readLine()",
      "begin_line": 122,
      "end_line": 134,
      "comment": "\n     * Calls {@link BufferedReader#readLine()} which drops the line terminator(s). This method should only be called\n     * when processing a comment, otherwise information can be lost.\n     * \u003cp\u003e\n     * Increments {@link #eolCounter}\n     * \u003cp\u003e\n     * Sets {@link #lastChar} to {@link Constants#END_OF_STREAM} at EOF, otherwise to LF\n     *\n     * @return the line that was read, or null if reached EOF.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 45)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.lookAhead()",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n     * Returns the next character in the current reader without consuming it. So the next call to {@link #read()} will\n     * still return this value. Does not affect line number or last character.\n     *\n     * @return the next character\n     *\n     * @throws IOException\n     *             if there is an error in reading\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 22)",
        "(line 147,col 9)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 22)",
        "(line 150,col 9)-(line 150,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getCurrentLineNumber()",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * Returns the current line number\n     *\n     * @return the current line number\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getPosition()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Gets the character position in the reader.\n     *\n     * @return the current position in the reader (counting characters, not bytes since this is a Reader)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.isClosed()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.close()",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Closes the stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 22)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 22)"
      ]
    }
  ]
}