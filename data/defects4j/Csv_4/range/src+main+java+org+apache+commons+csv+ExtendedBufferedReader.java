{
  "filepath": "/tmp/Csv-4b/src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedBufferedReader",
      "is_interface": false,
      "parent_types": [
        "java.io.BufferedReader"
      ],
      "begin_line": 37,
      "end_line": 178,
      "comment": "\n * A special buffered reader which supports sophisticated read access.\n * \u003cp\u003e\n * In particular the reader supports a look-ahead option, which allows you to see the next char returned by\n * {@link #read()}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastChar"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The last char returned "
    },
    {
      "type": "field",
      "varNames": [
        "eolCounter"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The count of EOLs (CR/LF/CRLF) seen so far "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.ExtendedBufferedReader(java.io.Reader)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Created extended buffered reader using default buffer-size\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.read()",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 41)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 27)",
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getLastChar()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Returns the last character that was read as an integer (0 to 65535). This will be the last character returned by\n     * any of the read methods. This will not include a character read using the {@link #lookAhead()} method. If no\n     * character has been read then this will return {@link Constants#UNDEFINED}. If the end of the stream was reached\n     * on the last read then this will return {@link Constants#END_OF_STREAM}.\n     *\n     * @return the last character that was read\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.read(char[], int, int)",
      "begin_line": 76,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 56)",
        "(line 84,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.readLine()",
      "begin_line": 116,
      "end_line": 128,
      "comment": "\n     * Calls {@link BufferedReader#readLine()} which drops the line terminator(s). This method should only be called\n     * when processing a comment, otherwise information can be lost.\n     * \u003cp\u003e\n     * Increments {@link #eolCounter}\n     * \u003cp\u003e\n     * Sets {@link #lastChar} to {@link Constants#END_OF_STREAM} at EOF, otherwise to LF\n     *\n     * @return the line that was read, or null if reached EOF.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 45)",
        "(line 120,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.lookAhead()",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n     * Returns the next character in the current reader without consuming it. So the next call to {@link #read()} will\n     * still return this value. Does not affect line number or last character.\n     *\n     * @return the next character\n     *\n     * @throws IOException\n     *             if there is an error in reading\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 22)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 22)",
        "(line 144,col 9)-(line 144,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getCurrentLineNumber()",
      "begin_line": 152,
      "end_line": 158,
      "comment": "\n     * Returns the current line number\n     *\n     * @return the current line number\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.isClosed()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.close()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Closes the stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 22)",
        "(line 174,col 9)-(line 174,col 33)",
        "(line 175,col 9)-(line 175,col 22)"
      ]
    }
  ]
}