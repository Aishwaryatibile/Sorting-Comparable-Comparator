package sort_comparator_comparable.api;

public class Song implements Comparable<Song> {

	private String title;
	private String artist;
	private Integer year;

	public Song(String title, String artist, Integer year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getartist() {
		return artist;
	}

	public void setartist(String artist) {
		this.artist = artist;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

	/*
	 * using compareTo method of String class(String class internally implements
	 * comparable interface) return
	 * this.gettitle().compareTo(anotherSong.gettitle());
	 */
	@Override
	public int compareTo(Song anotherSong) {

		if (this.getYear() > anotherSong.getYear()) {
			return +1;
		}
		if (this.getYear() < anotherSong.getYear()) {
			return -1;
		}
		return 0;
	}

}
