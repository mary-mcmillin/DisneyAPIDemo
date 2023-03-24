package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TVDTO {


    @JsonProperty("_links")
    private _links _links;
    @JsonProperty("updated")
    private int updated;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("externals")
    private Externals externals;
    @JsonProperty("network")
    private Network network;
    @JsonProperty("weight")
    private int weight;
    @JsonProperty("rating")
    private Rating rating;
    @JsonProperty("schedule")
    private Schedule schedule;
    @JsonProperty("officialSite")
    private String officialSite;
    @JsonProperty("ended")
    private String ended;
    @JsonProperty("premiered")
    private String premiered;
    @JsonProperty("averageRuntime")
    private int averageRuntime;
    @JsonProperty("runtime")
    private int runtime;
    @JsonProperty("status")
    private String status;
    @JsonProperty("genres")
    private List<String> genres;
    @JsonProperty("language")
    private String language;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("id")
    private int id;

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Externals getExternals() {
        return externals;
    }

    public void setExternals(Externals externals) {
        this.externals = externals;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public int getAverageRuntime() {
        return averageRuntime;
    }

    public void setAverageRuntime(int averageRuntime) {
        this.averageRuntime = averageRuntime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class _links {
        @JsonProperty("previousepisode")
        private Previousepisode previousepisode;
        @JsonProperty("self")
        private Self self;

        public Previousepisode getPreviousepisode() {
            return previousepisode;
        }

        public void setPreviousepisode(Previousepisode previousepisode) {
            this.previousepisode = previousepisode;
        }

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Previousepisode {
        @JsonProperty("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Self {
        @JsonProperty("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image {
        @JsonProperty("original")
        private String original;
        @JsonProperty("medium")
        private String medium;

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Externals {
        @JsonProperty("imdb")
        private String imdb;
        @JsonProperty("thetvdb")
        private int thetvdb;

        public String getImdb() {
            return imdb;
        }

        public void setImdb(String imdb) {
            this.imdb = imdb;
        }

        public int getThetvdb() {
            return thetvdb;
        }

        public void setThetvdb(int thetvdb) {
            this.thetvdb = thetvdb;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Network {
        @JsonProperty("country")
        private Country country;
        @JsonProperty("name")
        private String name;
        @JsonProperty("id")
        private int id;

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Country {
        @JsonProperty("timezone")
        private String timezone;
        @JsonProperty("code")
        private String code;
        @JsonProperty("name")
        private String name;

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Rating {
        @JsonProperty("average")
        private double average;

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Schedule {
        @JsonProperty("days")
        private List<String> days;
        @JsonProperty("time")
        private String time;

        public List<String> getDays() {
            return days;
        }

        public void setDays(List<String> days) {
            this.days = days;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
