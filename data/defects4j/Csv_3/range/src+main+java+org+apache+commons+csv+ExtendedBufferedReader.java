{
  "filepath": "/tmp/Csv-3b/src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedBufferedReader",
      "is_interface": false,
      "parent_types": [
        "java.io.BufferedReader"
      ],
      "begin_line": 37,
      "end_line": 153,
      "comment": "\n * A special reader decorator which supports more sophisticated access to the underlying reader object.\n * \u003cp\u003e\n * In particular the reader supports a look-ahead option, which allows you to see the next char returned by\n * {@link #read()}.\n *\n * @version $Id$\n "
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
        "lineCounter"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The line counter "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.ExtendedBufferedReader(java.io.Reader)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Created extended buffered reader using default buffer-size\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.read()",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 41)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getLastChar()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Returns the last character that was read as an integer (0 to 65535). This will be the last character returned by\n     * any of the read methods. This will not include a character read using the {@link #peek()} method. If no\n     * character has been read then this will return {@link #UNDEFINED}. If the end of the stream was reached on the\n     * last read then this will return {@link #END_OF_STREAM}.\n     *\n     * @return the last character that was read\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.read(char[], int, int)",
      "begin_line": 74,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 56)",
        "(line 82,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.readLine()",
      "begin_line": 114,
      "end_line": 126,
      "comment": "\n     * Calls {@link BufferedReader#readLine()} which drops the line terminator(s). This method should only be called\n     * when processing a comment, otherwise information can be lost.\n     * \u003cp\u003e\n     * Increments {@link #lineCounter}\n     * \u003cp\u003e\n     * Sets {@link #lastChar} to {@link #END_OF_STREAM} at EOF, otherwise to LF\n     *\n     * @return the line that was read, or null if reached EOF.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 45)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.lookAhead()",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\n     * Returns the next character in the current reader without consuming it. So the next call to {@link #read()} will\n     * still return this value.\n     *\n     * @return the next character\n     *\n     * @throws IOException\n     *             if there is an error in reading\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 22)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 22)",
        "(line 142,col 9)-(line 142,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.ExtendedBufferedReader.getLineNumber()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Returns the number of lines read\n     *\n     * @return the current-line-number (or -1)\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 27)"
      ]
    }
  ]
}